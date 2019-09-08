<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alien's Home</title>
</head>
<body>
	<div>
		<!-- <p>Formulario de Aliens</p> -->
		<!-- <form action="store" method="get">
			<input type="text" name="id" /><br />
			<input type="text" name="name" /><br />
			<input type="text" name="tech" /><br />
			<input type="submit" value="enviar" /><br />
		</form> -->
		
		<p>Fetch Aliens By Tech</p>
		<form action="show" method="get">
			<input type="text" name="tech" /><br />
			<input type="submit" value="enviar" /><br />
		</form>
		<p><a href="/logout">Logout</a></p>
	</div>
</body>
</html>