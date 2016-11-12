package cn.edu.nju.software.model;

import java.util.Date;
import java.util.UUID;

/**
 * 风险状态跟踪
 * 
 * @author 张波波
 *
 */
public class RiskTrack {
	/* 编号 */
	private String id = UUID.randomUUID().toString();
	/* 风险编号 */
	private String riskId;
	/* 描述 */
	private String desc;
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

	public String getRiskId() {
		return riskId;
	}

	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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
		return "RiskTrack [id=" + id + ", riskId=" + riskId + ", desc=" + desc + ", createGmt=" + createGmt
				+ ", modifyGmt=" + modifyGmt + "]";
	}

}
