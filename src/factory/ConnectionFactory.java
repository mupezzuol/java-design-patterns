package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			// Using VAR
			var server = "localhost";
			var banco = "dbtest";
			var user = "root";
			var pass = "1234";
			
			Connection con = DriverManager.getConnection("jdbc:postgres://"+server+"/"+banco, user, pass);
			
			return con;
			
		} catch (Exception e) {
			throw new RuntimeException("Exception: " + e);
		}
	}

}
