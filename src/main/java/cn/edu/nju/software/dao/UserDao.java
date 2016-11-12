package cn.edu.nju.software.dao;

import cn.edu.nju.software.model.User;

public interface UserDao {
	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	void addUser(User user);

	/**
	 * 通过昵称得到用户
	 * 
	 * @param nick
	 * @return
	 */
	User getUserByNick(String nick);
}
