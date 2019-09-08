<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<p>${ SPRING_SECURITY_LAST_EXCEPTION.message }</p>
	<form action="/login" method="POST">
		<table>
			<tr>
				<td>User: </td>
				<td><input type="text" name="username" value='' />

			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value='' />				
			</tr>
			<tr>
			<td><input type="submit" name="submit"  value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>