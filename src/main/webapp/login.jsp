<%@page language="java" pageEncoding="utf-8"%>
<%
	Object errorMsg = request.getAttribute("errorMsg");
%>
<html>
<body style="text-align: center;">
	<h3>登录</h3>
	<h5 style="color: red;"><%=errorMsg == null ? "" : errorMsg.toString()%></h5>
	<form action="<%=request.getContextPath()%>/user/login.action" method="post">
		<label>昵称：</label>
		<input type="text" name="nick" />
		<label>密码：</label>
		<input type="password" name="password" />
		<input type="submit" value="登录">
	</form>
</body>
</html>