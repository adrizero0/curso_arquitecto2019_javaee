package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Producto;


@WebServlet("/Agregar")
public class Agregar extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Producto p=new Producto(request.getParameter("nombre"), 
				Double.parseDouble(request.getParameter("precio")), 
				Integer.parseInt(request.getParameter("unidades")));
		HttpSession s=request.getSession();
		
		List<Producto> productos=(List<Producto>)s.getAttribute("carrito");
		productos.add(p);		
		
		request.getRequestDispatcher("nuevo.html").forward(request, response);
		
	}

}
