package cn.edu.nju.software.consts;

/**
 * 风险可能性枚举
 * 
 * @author 张波
 *
 */
public enum RiskPossibility {
	low(0, "低"), mid(1, "中"), high(2, "高");

	private final int value;
	private final String desc;

	private RiskPossibility(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

}
