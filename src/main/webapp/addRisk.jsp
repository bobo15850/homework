<%@page language="java" pageEncoding="utf-8"%>
<%
	String basePath = request.getContextPath();
	Object errorMsg = request.getAttribute("errorMsg");
	String submitId = (String) session.getAttribute("userId");
%>
<html>
<body style="text-align: center;">
	<h3>添加风险条目</h3>
	<h5 style="color: red;"><%=errorMsg == null ? "" : errorMsg%></h5>
	<form action="<%=request.getContextPath()%>/risk/addRisk.action" method="post">
		<input type="hidden" name="submiterId" value="<%=submitId%>">
		<label>风险内容：</label>
		<input type="text" name="content" />
		<br>
		<label>可能性：</label>
		<select name="posibility">
			<option value="0">低</option>
			<option value="1">中</option>
			<option value="2">高</option>
		</select>
		<br>
		<label>影响程度</label>
		<select name="impact">
			<option value="0">低</option>
			<option value="1">中</option>
			<option value="2">高</option>
		</select>
		<br>
		<label>触发条件</label>
		<input type="text" name="tigger" />
		<br>
		<label>跟踪者：</label>
		<input type="text" name="tracker" />
		<br>
		<input type="reset" value="重置">
		<input type="submit" value="添加">
	</form>
</body>
</html>