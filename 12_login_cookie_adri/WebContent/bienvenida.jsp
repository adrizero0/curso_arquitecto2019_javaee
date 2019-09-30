<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Persona"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	<%Persona persona=(Persona)session.getAttribute("persona");%>	--%>

	<h1>Usuario: ${sessionScope.persona.usuario}</h1>
	<h1>Email: ${sessionScope.persona.email}</h1>
	<h1>Edad:  ${sessionScope.persona.edad}</h1><br/>
	<h1>Preferencia:  ${param.pref}</h1><br/>
	<br/>
	<a href="formulario.html">Volver</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="Cierre">Cerrar sesión</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</body>
</html>