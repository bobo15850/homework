<%@page language="java" pageEncoding="utf-8"%>
<%
	String basePath = request.getContextPath();
	Object errorMsg = request.getAttribute("errorMsg");
%>
<html>
<body style="text-align: center;">
	<h3>注册</h3>
	<h5 style="color: red;"><%=errorMsg == null ? "" : errorMsg%></h5>
	<form action="<%=request.getContextPath()%>/user/register.action" method="post">
		<label>昵称</label>
		<input type="text" name="nick" />
		<label>密码</label>
		<input type="password" name="password" />
		<label>确认密码</label>
		<input type="password" name="confirm" />
		<input type="submit" value="注册">
	</form>
</body>
</html>