package cn.edu.nju.software.consts;

/**
 * 用户角色枚举
 * 
 * @author 张波
 *
 */
public enum Role {
	common(0, "普通用户"), admin(1, "管理员");

	private Role(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	private final int value;
	private final String desc;

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

	public Role retrieveRole(int value) {
		if (common.getValue() == value) {
			return common;
		}
		else if (admin.getValue() == value) {
			return admin;
		}
		throw new IllegalArgumentException("no such value of role,value = " + value);
	}

}
