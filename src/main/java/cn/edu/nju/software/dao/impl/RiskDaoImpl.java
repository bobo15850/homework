package cn.edu.nju.software.dao.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import cn.edu.nju.software.dao.RiskDao;
import cn.edu.nju.software.db.DB;
import cn.edu.nju.software.model.Risk;
import cn.edu.nju.software.model.RiskTrack;

public class RiskDaoImpl implements RiskDao {

	@Override
	public void addRisk(Risk risk) {
		DB.riskTable.put(risk.getId(), risk);
	}

	@Override
	public List<Risk> getRiskByUserId(String userId) {
		List<Risk> risks = new ArrayList<>();
		for (String id : DB.riskTable.keySet()) {
			if (userId.equals(DB.riskTable.get(id).getSubmiterId())) {
				risks.add(DB.riskTable.get(id));
			}
		}
		risks.sort(new Comparator<Risk>() {
			@Override
			public int compare(Risk o1, Risk o2) {
				return o2.getCreateGmt().compareTo(o1.getCreateGmt());
			}

		});
		return risks;
	}

	@Override
	public Risk getRiskById(String riskId) {
		return DB.riskTable.get(riskId);
	}

	@Override
	public void trackRisk(RiskTrack riskTrack) {
		DB.trackTable.put(riskTrack.getId(), riskTrack);
	}

	@Override
	public List<RiskTrack> getRiskTracks(String riskId) {
		List<RiskTrack> tracks = new ArrayList<>();
		for (String id : DB.trackTable.keySet()) {
			if (riskId.equals(DB.trackTable.get(id).getRiskId())) {
				tracks.add(DB.trackTable.get(id));
			}
		}
		tracks.sort(new Comparator<RiskTrack>() {

			@Override
			public int compare(RiskTrack o1, RiskTrack o2) {
				return o2.getCreateGmt().compareTo(o1.getCreateGmt());
			}
		});
		return tracks;
	}
}
