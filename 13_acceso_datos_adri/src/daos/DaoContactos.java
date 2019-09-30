package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoContactos {
	private static final String url="jdbc:mysql://localhost:3306/agenda";
	private static final String user="root";
	private static final String pwd="root";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	public void altaContacto() {
		try(Connection con=DriverManager.getConnection(url,user,pwd)){
			String sql="insert into contactos(nombre, email, edad) values(";
			sql+="'jdbc', 'jdbc@gmad',50";
			Statement st=con.createStatement();
			st.execute(sql);			
		}catch(SQLException ex) {
			ex.printStackTrace();
			
		}
	}
	
}
