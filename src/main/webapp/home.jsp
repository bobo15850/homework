<%@page language="java" pageEncoding="utf-8"%>
<%
	Object errorMsg = request.getAttribute("errorMsg");
%>
<html>
<body style="text-align: center;">
	<h2><%=session.getAttribute("userId")%></h2>
</body>
</html>