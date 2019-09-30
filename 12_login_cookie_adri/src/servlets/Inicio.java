package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Persona;

@WebServlet("/Inicio")
public class Inicio extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies=request.getCookies();
		RequestDispatcher dispatcher=request.getRequestDispatcher("formulario.html");
		if (cookies!=null) {
			for(Cookie ck:cookies) {
				if(ck.getName().equals("usuario")) {
					String user=ck.getValue();
					Persona p= new Persona(user, "hola@gmail.com",30);
					HttpSession sesion=request.getSession();
					sesion.setAttribute("persona", p);
					dispatcher=request.getRequestDispatcher("preferencias.html");
				}				
			}
		}
		dispatcher.forward(request, response);		
	}

}
