package in.kannan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String DRIVER_CLASS_NAME = "org.postgresql.Driver";
	private static final String DATABASE_NAME = "postgres";
	private static final String DB_USERNAME = "postgres";
	private static final String DB_PASSWORD = "LOV8Y2000aLOV8Y2000a";
	private static final String HOST = "localhost";
	private static final int PORT = 5432;
	private static final String DB_URL = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DATABASE_NAME;

	public static Connection getConnection() {

		Connection connection = null;
		

		// Step 1: Load the database driver into memory
		try {
			Class.forName(DRIVER_CLASS_NAME);

			// Step 2: Get the Database Connection
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException("Unable to get the database connection");
		} 
		return connection;

	}
	
		
		
}
