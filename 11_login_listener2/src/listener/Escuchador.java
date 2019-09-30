package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class Escuchador implements HttpSessionListener, ServletContextListener {

	int contador;
	
    public void sessionCreated(HttpSessionEvent se)  {
    	HttpSession sesion=se.getSession();
    	sesion.getServletContext();
        
    }

    public void sessionDestroyed(HttpSessionEvent se)  {
         se.getSession();
         
    }

    public void contextDestroyed(ServletContextEvent sce)  {
    	contador--;         
    }

    public void contextInitialized(ServletContextEvent sce)  {
         contador++;
    }
	
}
