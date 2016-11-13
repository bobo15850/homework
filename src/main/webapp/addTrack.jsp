<%@page language="java" pageEncoding="utf-8"%>
<%
	String riskId = (String) request.getAttribute("riskId");
	String basePath = request.getContextPath();
%>
<html>
<body style="text-align: center;">
	<h3>跟踪风险</h3>
	<form action="<%=basePath%>/risk/trackRisk.action" method="post">
		<input type="hidden" name="riskId" value="<%=riskId%>">
		<label>跟踪描述</label>
		<input name="desc" type="text" />
		<input type="submit" value="提交" />
	</form>
</body>
</html>