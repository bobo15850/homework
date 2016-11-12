package cn.edu.nju.software.consts;

/**
 * 用户角色枚举
 * 
 * @author 张波
 *
 */
public enum Role {
	COMMON(0, "普通用户"), ADMIN(1, "管理员");

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
		if (COMMON.getValue() == value) {
			return COMMON;
		}
		else if (ADMIN.getValue() == value) {
			return ADMIN;
		}
		throw new IllegalArgumentException("no such value of role,value = " + value);
	}

}
