package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectioFactory {
	
	public Connection getConnection(){
			Connection c;
			try {
				c = DriverManager.getConnection("jdbc...", "", "");
				return c;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
	}

}
