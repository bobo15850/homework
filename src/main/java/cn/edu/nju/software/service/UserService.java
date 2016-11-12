package cn.edu.nju.software.service;

import cn.edu.nju.software.consts.ResultDO;

public interface UserService {
	/**
	 * 注冊用戶
	 * 
	 * @param nick
	 * @param password
	 * @param role
	 * @return
	 */
	ResultDO<Boolean> register(String nick, String password, int role);

	/**
	 * 登陆
	 * 
	 * @param nick
	 * @param password
	 * @return
	 */
	ResultDO<Boolean> login(String nick, String password);

}
