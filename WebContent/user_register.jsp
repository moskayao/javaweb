<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
    <%@ page import="java.util.List"  %>
    <%@ page import="com.ZGY.Servlet.pojo.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>�û��б�</title>
</head>
<body>
<h1 align="center">�û�ע��</h1>
<hr>
<form action="user_register.do"  method="post" >
 <table border="1",align="center" width="80%"  cellspacing="0" cellpadding="0">
	<tr>
	<td>�û���</td><td><input type="text" name="username"></td>
	</tr>
	<tr>
	<td>����</td><td><input type="password" name="password"></td>
	</tr>
	<tr>
	<td>�绰</td><td><input type="text" name="phone"></td>
	</tr>
	<tr>
	<td>�û���ַ</td><td><textarea name="addr"></textarea></td>
	</tr>
	<tr>
	<td colspan="2"><input type="rest" value="����"><input type="submit" value="�ύ"></td>
	</tr>

 </table>
</form>
</body>
</html>