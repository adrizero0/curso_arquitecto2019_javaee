package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Persona;


@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {
			Persona p= new Persona(user, "hola@gmail.com",30);
			HttpSession sesion=request.getSession();
			sesion.setAttribute("persona", p);
			
			rd=request.getRequestDispatcher("preferencias.html");
		}else {
			rd=request.getRequestDispatcher("error.jsp");
		}
		rd.forward(request, response);
		
	}

	
}
