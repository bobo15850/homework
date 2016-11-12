package cn.edu.nju.software.model;

import java.util.Date;

import cn.edu.nju.software.consts.RiskImpact;
import cn.edu.nju.software.consts.RiskPossibility;

/**
 * 风险条目
 * 
 * @author 张波波
 *
 */
public class Risk {
	/* uuid */
	private String id;
	/* 内容 */
	private String content;
	/* 可能性 */
	private RiskPossibility posibility;
	/* 影响 */
	private RiskImpact impact;
	/* 触发器 */
	private String tigger;
	/* 提交者 */
	private User submiter;
	/* 跟踪者 */
	private User tracker;
	/* 创建时间 */
	private Date createGmt;
	/* 修改时间 */
	private Date modifyGmt;

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

	public RiskPossibility getPosibility() {
		return posibility;
	}

	public void setPosibility(RiskPossibility posibility) {
		this.posibility = posibility;
	}

	public RiskImpact getImpact() {
		return impact;
	}

	public void setImpact(RiskImpact impact) {
		this.impact = impact;
	}

	public String getTigger() {
		return tigger;
	}

	public void setTigger(String tigger) {
		this.tigger = tigger;
	}

	public User getSubmiter() {
		return submiter;
	}

	public void setSubmiter(User submiter) {
		this.submiter = submiter;
	}

	public User getTracker() {
		return tracker;
	}

	public void setTracker(User tracker) {
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
				+ ", tigger=" + tigger + ", submiter=" + submiter + ", tracker=" + tracker + ", createGmt=" + createGmt
				+ ", modifyGmt=" + modifyGmt + "]";
	}

}
