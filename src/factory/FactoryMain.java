package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FactoryMain {

	public static void main(String[] args) throws SQLException {
		System.out.println("--------------------------------------------- Begin Test Factory");

		// Call method Factory for create a Connection
		Connection con = new ConnectionFactory().getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from table;");
		
		
		System.out.println("--------------------------------------------- End Test Factory");
	}

}
