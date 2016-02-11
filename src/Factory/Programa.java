	package Factory;

import java.sql.Connection;

public class Programa {
	
	public static void main(String[] args) {
		
		Connection con = new ConnectioFactory().getConnection();
		
	}
}
