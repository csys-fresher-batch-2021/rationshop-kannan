package in.kannan.service;

import java.util.ArrayList;

import java.util.List;

import in.kannan.exception.MyException;
import in.kannan.validation.UserValidation;

public class MemberDetailService {

	private MemberDetailService() {
		// Default constructor
	}

	private static final List<String> familyMembers = new ArrayList<>();
	

	static {
		familyMembers.add("Ramachandran");
		familyMembers.add("Vairam");
		familyMembers.add("Kannan");
	}
	/*
	 * returns the names of the familyMembers
	 */

	public static List<String> getFamilyMembers() {

		return familyMembers;
	}

	/**
	 * Returns the boolean value regarding addition of member in familyMember
	 * ArrayList
	 * 
	 * @param name
	 * @return
	 * @throws MyException 
	 */
	public static boolean addMember(String name) throws MyException {
		boolean isValid = false;
		if (UserValidation.isValidName(name)) {

			familyMembers.add(name);
			isValid = true;
		}

		return isValid;
	}

	/**
	 * Deletes the particular member from ArrayList
	 * 
	 * @param name
	 * @return
	 */

	public static boolean deleteMember(String name) {
		int index = familyMembers.indexOf(name);
		if (index != -1) {
			familyMembers.remove(index);
		}
		return true;
	}
	
}
