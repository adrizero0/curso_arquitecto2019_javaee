package resources;

import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import java.sql.Connection;

public class Data {
	private static DataSource getDataSource(String ref) {
		DataSource ds=null;
		try {
			Context ct=new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/"+ref);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return ds;
	}
	public static Connection getConnection(String ref) {
		Connection cn=null;
		DataSource ds=getDataSource(ref);
		try {
			cn=ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
}


