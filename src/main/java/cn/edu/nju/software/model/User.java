package cn.edu.nju.software.model;

import java.util.Date;
import java.util.UUID;

import cn.edu.nju.software.consts.Role;

public class User {
	/* UUID */
	private String id = UUID.randomUUID().toString();
	/* 昵称 */
	private String nick;
	/* 角色 */
	private Integer role = Role.COMMON.getValue();
	/* 密码 */
	private String password;
	/* 创建时间 */
	private Date createGmt = new Date();
	/* 修改时间 */
	private Date modifyGmt = new Date();

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

	public Date getCreateGmt() {
		return createGmt;
	}

	public void setCreateGmt(Date createGmt) {
		this.createGmt = createGmt;
	}

	public Date getModifyGmt() {
		return modifyGmt;
	}

	public void setModifyGmt(Date modifyGmt) {
		this.modifyGmt = modifyGmt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nick=" + nick + ", role=" + role + ", password=" + password + ", createGmt="
				+ createGmt + ", modifyGmt=" + modifyGmt + "]";
	}

}