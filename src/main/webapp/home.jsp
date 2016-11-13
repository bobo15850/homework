<%@page import="cn.edu.nju.software.model.Risk"%>
<%@page import="java.util.List"%>
<%@page import="cn.edu.nju.software.model.User"%>
<%@page language="java" pageEncoding="utf-8"%>
<%
	String basePath = request.getContextPath();
	Object nick = request.getAttribute("nick");
	Object riskObj = request.getAttribute("risks");
	List<Risk> risks = (List<Risk>) riskObj;
%>
<html>
<body style="text-align: center;">
	<h3>
		欢迎你
		<%=(nick == null) ? "" : nick.toString()%>
	</h3>
	<h4>
		<a href="<%=basePath%>/user/logout.action">退出</a>
	</h4>
	<h4>
		<a href="<%=basePath%>/addRisk.jsp">添加风险条目</a>
	</h4>
	<hr>
	<h3>我的风险条目</h3>
	<%
		for (Risk risk : risks) {
	%>
	<h4>
		<a href="<%=basePath%>/risk/showRisk.action?riskId=<%=risk.getId()%>"><%=risk.getContent()%></a>
	</h4>
	<%
		}
	%>

</body>
</html>