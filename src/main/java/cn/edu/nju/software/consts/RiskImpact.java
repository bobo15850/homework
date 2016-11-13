package cn.edu.nju.software.consts;

/**
 * 风险可能性
 * 
 * @author 张波
 *
 */
public enum RiskImpact {
	LOW(0, "低"), MID(1, "中"), HIGH(2, "高");

	private final int value;
	private final String desc;

	private RiskImpact(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

	public static RiskImpact retrieveRiskImpact(int value) {
		if (value == 0) {
			return LOW;
		}
		if (value == 1) {
			return MID;
		}
		if (value == 2) {
			return HIGH;
		}
		return LOW;
	}
}
