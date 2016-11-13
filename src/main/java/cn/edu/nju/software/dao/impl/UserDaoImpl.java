package cn.edu.nju.software.dao.impl;

import cn.edu.nju.software.dao.UserDao;
import cn.edu.nju.software.db.DB;
import cn.edu.nju.software.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		DB.userTable.put(user.getId(), user);
	}

	@Override
	public User getUserByNick(String nick) {
		for (String id : DB.userTable.keySet()) {
			User user = DB.userTable.get(id);
			if (nick.equals(user.getNick())) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getUserById(String UserId) {
		return DB.userTable.get(UserId);
	}
}
