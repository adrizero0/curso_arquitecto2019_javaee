<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Persona"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%Persona persona=(Persona)session.getAttribute("persona");%>
	<h1>Usuario: <%=persona.getUsuario()%></h1>
	<h1>Email: <%=persona.getEmail()%></h1>
	<h1>Edad: <%=persona.getEdad()%></h1><br/>
	<h1>Preferencia: <%=request.getParameter("pref")%></h1><br/>
	<br/>
	<h1>Usuarios conectados: <%=application.getAttribute("contador")%></h1>
	<br/>
	<a href=formulario.html>Volver</a>
</body>
</html>