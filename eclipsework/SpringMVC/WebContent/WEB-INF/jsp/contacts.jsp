<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>contact list</title>
<style type="text/css">
	table{
		border:1px solid gray;
		border-radius:3px;
		border-collapse: collapse;
	}
	td{
		border:1px solid gray;
	}
</style>
</head>
<body>
	<table style="border:1px solid gray;">
		<tr>
			<td>姓名</td>
			<td>邮箱</td>
			<td>电话</td>
		</tr>
		<c:forEach var="contact" items="${contactList}">
			<tr>
				<td>${contact.name}</td>
				<td>${contact.email}</td>
				<td>${contact.telphone}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>