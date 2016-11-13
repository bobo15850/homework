<%@page import="cn.edu.nju.software.model.RiskTrack"%>
<%@page import="java.util.List"%>
<%@page import="cn.edu.nju.software.consts.RiskImpact"%>
<%@page import="cn.edu.nju.software.consts.RiskPossibility"%>
<%@page import="cn.edu.nju.software.model.Risk"%>
<%@page language="java" pageEncoding="utf-8"%>
<%
	String basePath = request.getContextPath();
	Object riskObj = request.getAttribute("risk");
	Risk risk = (Risk) riskObj;
	List<RiskTrack> tracks = (List<RiskTrack>) request.getAttribute("tracks");
%>
<html>
<body style="text-align: center;">
	<h4>
		<a href="<%=basePath%>/user/toHome.action">返回</a>
	</h4>
	<h4>
		风险内容:<%=risk.getContent()%>
	</h4>

	<h4>
		风险可能性:<%=RiskPossibility.retrieveRiskPossibility(risk.getPosibility()).getDesc()%>
	</h4>
	<h4>
		影响程度:<%=RiskImpact.retrieveRiskImpact(risk.getImpact()).getDesc()%>
	</h4>
	<h4>
		触发条件:<%=risk.getTigger()%>
	</h4>
	<h4>
		跟踪者:<%=risk.getTracker()%>
	</h4>
	<hr>
	<h4>
		<a href="<%=basePath%>/risk/toTrack.action?riskId=<%=risk.getId()%>">添加跟踪</a>
	</h4>
	<%
		for (RiskTrack track : tracks) {
	%>
	<h5>
		跟踪信息：<%=track.getDesc()%>，时间<%=track.getCreateGmt().toString()%>
	</h5>
	<%
		}
	%>
</body>
</html>