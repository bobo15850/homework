package cn.edu.nju.software.model;

public class User {
	/* UUID */
	private String id;
	/* 昵称 */
	private String nick;
	/* 角色  */
	private Integer role;
	/* 密码 */
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}