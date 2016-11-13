package cn.edu.nju.software.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nju.software.consts.ResultDO;
import cn.edu.nju.software.dao.UserDao;
import cn.edu.nju.software.model.User;
import cn.edu.nju.software.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public ResultDO<User> login(String nick, String password) {
		ResultDO<User> resultDO = new ResultDO<>();
		User user = userDao.getUserByNick(nick);
		if (user == null || !password.equals(user.getPassword())) {
			resultDO.setSuccess(false);
			resultDO.setErrorMsg("用户名或密码错误");
			return resultDO;
		}
		resultDO.setSuccess(true);
		resultDO.setModel(user);
		return resultDO;
	}

	@Override
	public ResultDO<Boolean> register(String nick, String password) {
		ResultDO<Boolean> resultDO = new ResultDO<>();
		User user = userDao.getUserByNick(nick);
		if (user != null) {
			resultDO.setSuccess(false);
			resultDO.setErrorMsg("昵称已存在");
			return resultDO;
		}
		user = new User();
		user.setNick(nick);
		user.setPassword(password);
		userDao.addUser(user);

		resultDO.setSuccess(true);
		resultDO.setModel(true);
		return resultDO;
	}

	@Override
	public ResultDO<User> getUserById(String userId) {
		ResultDO<User> resultDO = new ResultDO<>();
		resultDO.setSuccess(true);
		resultDO.setModel(userDao.getUserById(userId));
		return resultDO;
	}

}
