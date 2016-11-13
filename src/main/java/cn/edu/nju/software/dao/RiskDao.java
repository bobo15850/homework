package cn.edu.nju.software.dao;

import java.util.List;

import cn.edu.nju.software.model.Risk;
import cn.edu.nju.software.model.RiskTrack;

public interface RiskDao {
	/**
	 * 添加风险条目
	 * 
	 * @param risk
	 */
	void addRisk(Risk risk);

	/**
	 * 通过用户编号得到风险条目
	 * 
	 * @param userId
	 * @return
	 */
	List<Risk> getRiskByUserId(String userId);

	/**
	 * 通过风险编号得到风险条目
	 * 
	 * @param riskId
	 * @return
	 */
	Risk getRiskById(String riskId);

	/**
	 * 添加风险跟踪信息
	 * 
	 * @param riskTrack
	 */
	void trackRisk(RiskTrack riskTrack);

	/**
	 * 通过风险编号得到全部风险跟踪信息
	 * 
	 * @param riskId
	 * @return
	 */
	List<RiskTrack> getRiskTracks(String riskId);
}
