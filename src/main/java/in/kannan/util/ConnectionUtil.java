package in.kannan.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private ConnectionUtil() {
		super();
		
	}


	private static final String DRIVER_CLASS_NAME = System.getenv("spring.datasource.driver-class-name");
	private static final String DB_URL = System.getenv("spring.datasource.url");
	private static final String DB_USERNAME = System.getenv("spring.datasource.username");
	private static final String DB_PASSWORD = System.getenv("spring.datasource.password");


	public static Connection getConnection() {

		Connection connection = null;
		

		// Step 1: Load the database driver into memory
		try {
			Class.forName(DRIVER_CLASS_NAME);

			// Step 2: Get the Database Connection
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();

		} 
		return connection;

	}
	
		
		
}
