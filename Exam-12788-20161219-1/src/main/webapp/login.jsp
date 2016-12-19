<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录页面</title>
</head>
<body>
<%
	String path=request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<form action="login" method="post">
<table>
<tr>
<td>用户名</td>
<td><input type="text" name="user" id="user"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" name="submit" value="提交"/>&nbsp;&nbsp;<input type="reset" value="重置" name="reset"/></td>
</tr>
</table>
</form>

</body>
</html>