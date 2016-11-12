<%@page language="java" pageEncoding="utf-8"%>
<%
	String basePath = request.getContextPath();
%>
<html>
<body style="text-align: center;">
	<h2>欢迎来到软件项目风险管理系统</h2>
	<h3>
		<a href="<%=basePath%>/login.jsp">登录</a>
	</h3>
	<h3>
		<a href="<%=basePath%>/register.jsp">注册</a>
	</h3>
</body>
</html>
