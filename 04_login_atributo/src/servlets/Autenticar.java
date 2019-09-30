package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Persona;


@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {
			Persona p= new Persona(user, "hola@gmail.com",30);
			request.setAttribute("persona", p);
			rd=request.getRequestDispatcher("Bienvenida");
		}else {
			rd=request.getRequestDispatcher("Error");
		}
		rd.forward(request, response);
		
	}

	
}
