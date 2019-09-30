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

import model.Compra;


@WebServlet("/Comprar")
public class Comprar extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String producto=request.getParameter("producto");
		int unidades=Integer.parseInt(request.getParameter("unidades"));
		double precio=Double.parseDouble(request.getParameter("precio"));
		
		Compra c= new Compra(producto, unidades, precio);
		HttpSession s=request.getSession();
		
		List<Compra> compras=(List<Compra>)s.getAttribute("compra");
		//si no hay carrito aún, se crea el arraylist y se guarda en el atributo carrito
		if(compras==null){
			compras=new ArrayList<>();
			s.setAttribute("compra", compras);		
		}
		//tanto si es nuevo carrito como uno ya existente, se añade el nuevo producto
		//al mismo
		compras.add(c);
		
		request.getRequestDispatcher("opciones.html").forward(request, response);
				
		
	}

}
