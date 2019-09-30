<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Compra, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</head>
<body>
 	<%List<Compra> compras=(List<Compra>)session.getAttribute("compra"); %>
	<table class="table">
	  <thead>
		<tr>
		    <th scope="col">Producto</th>
		    <th scope="col">Unidades</th>
		    <th scope="col">Precio</th>
		</tr>
	  </thead>
	  <tbody>
	  	<% if(compras!=null){%>
	  		<% for (Compra c:compras){ %>
		    	<tr>	    				   	
				    <td><%=c.getProducto()%></td>
				    <td><%=c.getUnidades()%></td>
				    <td><%=c.getPrecio()%></td>		    
		    	</tr>
		    <%}%>		    	
	    <%}%>	    
	  </tbody>
	</table>
	<br/><br/>
	<a href="opciones.html">Volver</a>

</body>
</html>