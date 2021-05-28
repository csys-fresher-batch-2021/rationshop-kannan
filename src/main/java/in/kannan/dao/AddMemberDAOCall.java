package in.kannan.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.kannan.exception.InValidUserDataException;
import in.kannan.model.UserDetails;

public class AddMemberDAOCall {
	private AddMemberDAOCall() {
		super();
	}

	static List<UserDetails> detail = new ArrayList<>();

	public static void callDAO(String name, int userId) throws InValidUserDataException {

		UserDetails usd1 = new UserDetails(name, userId);

		detail.add(usd1);

		try {
			RationShopAddMemberDAO.save(detail);
		} catch (SQLException e) {
			throw new InValidUserDataException("Inputs are InValid");

		}

	}

	public static List<UserDetails> userDetails() {
		return detail;
	}

}
