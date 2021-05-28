package in.kannan.service;

import java.util.ArrayList;
import java.util.List;

import in.kannan.dao.AddMemberDAOCall;

import in.kannan.exception.InValidUserDataException;
import in.kannan.exception.ValidationException;
import in.kannan.model.UserDetails;
import in.kannan.validation.UserValidation;

public class RationCardDAO {
	private RationCardDAO() {
		super();
	}

	static List<UserDetails> data = new ArrayList<>();

	public static void addMember(String name, int userId) throws ValidationException, InValidUserDataException {

		if (UserValidation.isValidName(name) && UserValidation.isValidUserId(userId)) {
			AddMemberDAOCall.callDAO(name, userId);

		}
	}

}
