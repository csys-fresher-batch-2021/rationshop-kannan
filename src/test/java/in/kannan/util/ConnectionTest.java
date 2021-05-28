package in.kannan.util;

import java.sql.Connection;

public class ConnectionTest {
	public static void main(String[] args) {
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection);
	}

}
