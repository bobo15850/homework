package cn.edu.nju.software.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nju.software.consts.ResultDO;
import cn.edu.nju.software.dao.RiskDao;
import cn.edu.nju.software.model.Risk;
import cn.edu.nju.software.model.RiskTrack;
import cn.edu.nju.software.service.RiskService;

public class RiskServiceImpl implements RiskService {
	@Autowired
	private RiskDao riskDao;

	@Override
	public ResultDO<List<Risk>> getRiskByUserId(String userId) {
		ResultDO<List<Risk>> resultDO = new ResultDO<>();
		List<Risk> risks = riskDao.getRiskByUserId(userId);
		resultDO.setSuccess(true);
		resultDO.setModel(risks);
		return resultDO;
	}

	@Override
	public ResultDO<Boolean> addRisk(Risk risk) {
		ResultDO<Boolean> resultDO = new ResultDO<>();
		riskDao.addRisk(risk);
		resultDO.setModel(true);
		resultDO.setSuccess(true);
		return resultDO;
	}

	@Override
	public ResultDO<Boolean> addRiskTrack(RiskTrack riskTrack) {
		ResultDO<Boolean> resultDO = new ResultDO<>();
		riskDao.trackRisk(riskTrack);
		resultDO.setSuccess(true);
		resultDO.setModel(true);
		return resultDO;
	}

	@Override
	public ResultDO<Risk> getRiskById(String riskId) {
		ResultDO<Risk> resultDO = new ResultDO<>();
		Risk risk = riskDao.getRiskById(riskId);
		resultDO.setSuccess(true);
		resultDO.setModel(risk);
		return resultDO;
	}

	@Override
	public ResultDO<List<RiskTrack>> getRiskTracks(String riskId) {
		ResultDO<List<RiskTrack>> resultDO = new ResultDO<>();
		List<RiskTrack> riskTracks = riskDao.getRiskTracks(riskId);
		resultDO.setSuccess(true);
		resultDO.setModel(riskTracks);
		return resultDO;
	}

}
