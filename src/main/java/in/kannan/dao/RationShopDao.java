package in.kannan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.kannan.util.ConnectionUtil;

public class RationShopDao {

	public static void main(String[] args) throws Exception {

		// I want to add member name in database
		String memberName = "KANNAN";

		Connection connection = null;
		PreparedStatement pst = null;

		

			try {
				// Step 1: Get connection
				connection = ConnectionUtil.getConnection();

				// Step 2 : Prepare data
				// prepared statement execute the same or similar database statement repeatedly
				// with high efficiency

				String sql = "insert into member(name) values(?)";

				pst = connection.prepareStatement(sql);

				// sets the value
				pst.setString(1, memberName);

				// Step3 : Execute Query (insert/update/delete - call executeUpdate())
				int rows = pst.executeUpdate();

				System.out.println("No of rows inserted : " + rows);
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				throw new Exception("Unable to add product");
			} finally {
				if(pst != null)
				{
					pst.close();
				}
				if(connection != null)
				{
					connection.close();
				}
			}

		
		}
	}
