<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>contact add</title>
</head>
<body>
	<h2>Contact Manager</h2>
	<form method="post" action="addContact.do">
		<table>
			<tr>
				<td>Name</td>
				<td><input name="name"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input name="email"/></td>
			</tr>
			<tr>
				<td>Telephone</td>
				<td><input name="telphone"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Contact" /></td>
			</tr>
		</table>

	</form>
</body>
</html>
