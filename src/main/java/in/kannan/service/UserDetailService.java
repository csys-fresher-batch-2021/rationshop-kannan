package in.kannan.service;

import java.util.ArrayList;
import java.util.List;

import in.kannan.exception.MyException;
import in.kannan.model.UserDetails;
import in.kannan.validation.UserValidation;

public class UserDetailService {

	private static List<UserDetails> userData = new ArrayList<>();

	public static void userDetailRegister(String name, int age, String gender) throws MyException {

		
		UserDetails user = new UserDetails(name, age, gender);
		String name1 = user.getName();
		int age1 = user.getAge();
		String gender1 = user.getGender();
		try {
			if (isValidUser(name1, age1, gender1)) {
				userData.add(user);
				
			}
			
		}catch(MyException e)
		{
			throw new MyException("InValid Addition");
		}

		

		
	}

	public static boolean isValidUser(String name, int age, String gender)throws MyException {
		boolean isValid = false;
		try {
			if (UserValidation.isValidName(name) && UserValidation.isValidAge(age)
					&& UserValidation.isValidGender(gender)) {

				isValid = true;
			}
			
		}catch(MyException e)
		{
			throw new MyException("InValid User's Data");
		}
	

		return isValid;
	}

	public static List<UserDetails> userDetails() {
		return userData;
	}

	public static void userDetailsReset() {
		userData.clear();
	}
	
	


	public static void main(String[] args) throws MyException {
		userDetailRegister("kannan", 20, "Male");
		userDetailRegister("Priya", 22, "Female");
		System.out.println(userDetails());
		
	}

}
