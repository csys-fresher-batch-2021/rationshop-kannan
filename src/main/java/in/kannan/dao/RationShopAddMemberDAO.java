package in.kannan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import in.kannan.model.UserDetails;

import in.kannan.util.ConnectionUtil;

public class RationShopAddMemberDAO {
	private RationShopAddMemberDAO() {
		super();
	}

	public static void save(UserDetails detail) throws SQLException {

		Connection connection = null;
		PreparedStatement pst = null;

		try {
			// Step 1: Get connection
			connection = ConnectionUtil.getConnection();

			// Step 2 : Prepare data
			// prepared statement execute the same or similar database statement repeatedly
			// with high efficiency

			String sql = "insert into member(name,user_id) values(?,?)";

			pst = connection.prepareStatement(sql);

			// sets the value
			pst.setString(1, detail.getName());
			pst.setInt(2, detail.getUserId());

			// Step3 : Execute Query (insert/update/delete - call executeUpdate())
			pst.executeUpdate();
		



		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				close(pst, connection);
			} catch (NullPointerException e) {

				e.printStackTrace();
			}

		}

	}

	public static void close(PreparedStatement pst, Connection connection) throws SQLException {
		pst.close();
		connection.close();

	}

	public static void save(List<UserDetails> detail) throws SQLException {
		for (UserDetails data : detail) {

			save(data);
		}

	}
}
