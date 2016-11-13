package cn.edu.nju.software.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.nju.software.consts.ResultDO;
import cn.edu.nju.software.model.Risk;
import cn.edu.nju.software.model.RiskTrack;
import cn.edu.nju.software.service.RiskService;

@Controller
@RequestMapping("risk")
public class RiskController {
	@Autowired
	private RiskService riskService;

	@RequestMapping("showRisk")
	public String showRisk(HttpServletRequest request, String riskId) {
		ResultDO<Risk> risk = riskService.getRiskById(riskId);
		ResultDO<List<RiskTrack>> tracks = riskService.getRiskTracks(riskId);
		request.setAttribute("risk", risk.getModel());
		request.setAttribute("tracks", tracks.getModel());
		return "riskItem";
	}

	@RequestMapping(value = "trackRisk", method = { RequestMethod.POST })
	public String trackRisk(HttpServletRequest request, RiskTrack riskTrack) {
		riskService.addRiskTrack(riskTrack);
		ResultDO<Risk> risk = riskService.getRiskById(riskTrack.getRiskId());
		ResultDO<List<RiskTrack>> tracks = riskService.getRiskTracks(riskTrack.getRiskId());
		request.setAttribute("risk", risk.getModel());
		request.setAttribute("tracks", tracks.getModel());
		return "riskItem";
	}

	@RequestMapping(value = "addRisk", method = { RequestMethod.POST })
	public String addRisk(HttpServletRequest request, Risk risk) {
		riskService.addRisk(risk);
		ResultDO<List<RiskTrack>> resultDO = riskService.getRiskTracks(risk.getId());
		request.setAttribute("risk", risk);
		request.setAttribute("tracks", resultDO.getModel());
		return "riskItem";
	}

	@RequestMapping(value = "toTrack")
	public String toTrack(HttpServletRequest request, String riskId) {
		request.setAttribute("riskId", riskId);
		return "addTrack";
	}

}
