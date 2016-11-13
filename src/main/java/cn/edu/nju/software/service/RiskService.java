package cn.edu.nju.software.service;

import java.util.List;

import cn.edu.nju.software.consts.ResultDO;
import cn.edu.nju.software.model.Risk;
import cn.edu.nju.software.model.RiskTrack;

public interface RiskService {

	/**
	 * 得到用户提交的所有风险条目
	 * 
	 * @param userId
	 * @return
	 */
	ResultDO<List<Risk>> getRiskByUserId(String userId);

	/**
	 * 添加风险条目
	 * 
	 * @param risk
	 * @return
	 */
	ResultDO<Boolean> addRisk(Risk risk);

	/**
	 * 添加风险跟踪
	 * 
	 * @param riskTrack
	 * @return
	 */
	ResultDO<Boolean> addRiskTrack(RiskTrack riskTrack);

	/**
	 * 通过id得到风险条目
	 * 
	 * @param riskId
	 * @return
	 */
	ResultDO<Risk> getRiskById(String riskId);

	/**
	 * 得到风险的所有跟踪
	 * 
	 * @param riskId
	 * @return
	 */
	ResultDO<List<RiskTrack>> getRiskTracks(String riskId);
}
