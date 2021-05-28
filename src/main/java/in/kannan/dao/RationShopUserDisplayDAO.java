package in.kannan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.kannan.model.UserDetails;
import in.kannan.util.ConnectionUtil;

public class RationShopUserDisplayDAO {
	private RationShopUserDisplayDAO() {
		super();
	}

	public static List<UserDetails> getAllUsers() throws Exception {
		List<UserDetails> users = new ArrayList<>(); // Array List creation
		Connection con = null; // to get connection
		PreparedStatement pst = null; // It executes similar DB Statements with high efficiency
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getConnection();

			String sql = "Select id,name,user_id from member";
			pst = con.prepareStatement(sql);

			rs = pst.executeQuery(); // to execute the query

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int userId = rs.getInt("user_id");

				// Store the data in object
				UserDetails user = new UserDetails(id, name, userId);
				// Store all products in list
				users.add(user);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				close(rs, pst, con);
			} catch (NullPointerException e) {

				e.printStackTrace();
			}

		}
		return users;
	}

	public static void close(ResultSet rs, PreparedStatement pst, Connection con) throws SQLException {
		rs.close();
		pst.close();
		con.close();
	}
}
