package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Persona;

@WebServlet("/Bienvenida")
public class Bienvenida extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //tipo de formato de respuesta
		PrintWriter out=response.getWriter(); //construimos página de respuesta
		out.println("<html><body>");		
		
		Persona persona=(Persona)request.getAttribute("persona");
		out.println("<h1>Usuario: "+persona.getUsuario());
		out.println("<h1>Email: "+persona.getEmail());
		out.println("<h1>Usuario: "+persona.getEdad());		
		out.println("<br/>");
		out.println("<a href='formulario.html'>volver</a>");
		out.println("</body></html>");
	}

}
