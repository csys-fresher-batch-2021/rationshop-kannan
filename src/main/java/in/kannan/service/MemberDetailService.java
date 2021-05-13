package in.kannan.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.kannan.validation.StringValidation;

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
	 * returns the name of the familyMembers
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
	 */
	public static boolean addMember(String name) {
		boolean isValid = false;
		if (StringValidation.isValidName(name)) {

			familyMembers.add(name);
			isValid = true;
		}

		return isValid;
	}

}
