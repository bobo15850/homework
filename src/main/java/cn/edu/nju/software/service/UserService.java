package cn.edu.nju.software.service;

import cn.edu.nju.software.consts.ResultDO;
import cn.edu.nju.software.model.User;

public interface UserService {
	/**
	 * 注冊用戶
	 * 
	 * @param nick
	 * @param password
	 * @return
	 */
	ResultDO<Boolean> register(String nick, String password);

	/**
	 * 登陆
	 * 
	 * @param nick
	 * @param password
	 * @return
	 */
	ResultDO<User> login(String nick, String password);

}
