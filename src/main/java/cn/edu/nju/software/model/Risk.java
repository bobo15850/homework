package cn.edu.nju.software.model;

import java.util.Date;
import java.util.UUID;

/**
 * 风险条目
 * 
 * @author 张波波
 *
 */
public class Risk {
	/* uuid */
	private String id = UUID.randomUUID().toString();
	/* 内容 */
	private String content;
	/* 可能性 */
	private Integer posibility;
	/* 影响 */
	private Integer impact;
	/* 触发器 */
	private String tigger;
	/* 提交者 */
	private String submiterId;
	/* 跟踪者 */
	private String tracker;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getPosibility() {
		return posibility;
	}

	public void setPosibility(Integer posibility) {
		this.posibility = posibility;
	}

	public Integer getImpact() {
		return impact;
	}

	public void setImpact(Integer impact) {
		this.impact = impact;
	}

	public String getTigger() {
		return tigger;
	}

	public void setTigger(String tigger) {
		this.tigger = tigger;
	}

	public String getSubmiterId() {
		return submiterId;
	}

	public void setSubmiterId(String submiterId) {
		this.submiterId = submiterId;
	}

	public String getTracker() {
		return tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
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
		return "Risk [id=" + id + ", content=" + content + ", posibility=" + posibility + ", impact=" + impact
				+ ", tigger=" + tigger + ", submiterId=" + submiterId + ", tracker=" + tracker + ", createGmt="
				+ createGmt + ", modifyGmt=" + modifyGmt + "]";
	}

}
