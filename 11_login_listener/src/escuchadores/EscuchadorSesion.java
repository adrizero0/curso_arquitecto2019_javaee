package escuchadores;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class EscuchadorSesion implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
         ServletContext context=se.getSession().getServletContext();
         int activos=(Integer)context.getAttribute("activos");
         activos++;
         context.setAttribute("activos", activos);
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	ServletContext context=se.getSession().getServletContext();
        int activos=(Integer)context.getAttribute("activos");
        activos--;
        context.setAttribute("activos", activos);
    }
	
}
