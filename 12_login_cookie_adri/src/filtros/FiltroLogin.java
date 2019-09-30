package filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@WebFilter("/*")
public class FiltroLogin implements Filter {
  	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//RECUPERAMOS LA DIRECCION ORIGINAL SOLICITADA
		String path=((HttpServletRequest)request).getServletPath();
		
		if(path.equals("/")||path.equals("/Autenticar")) {
			chain.doFilter(request, response);
		}
		
		//COMPROBAMOS LA EXISTENCIA DEL ATRIBUTO DE SESION "PERSONA"
		//SI NO EXISTE, LO MANDAMOS A INICIO
		HttpSession sesion=((HttpServletRequest)request).getSession();
		if(sesion.getAttribute("persona")!=null) {
			chain.doFilter(request, response);
		}else {
			request.getRequestDispatcher("Inicio").forward(request, response);
		}		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
