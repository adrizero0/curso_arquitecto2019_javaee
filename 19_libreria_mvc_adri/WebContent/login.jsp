<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="Controller?op=doLogin" method="POST">
		 
		
			Usuario:<input type="text" name="user" /><br/>
			Contraseņa:<input type="password" name="pwd"/><br/>
			
			<br/>
			<input type="submit" value="Enviar"/><br/>
		</form>
		<br/>
		<a href="Controller?op=toRegistro">Registrese</a>
	</center>
	
</body>
</html>