package in.kannan.validation;

import in.kannan.exception.MyException;

public class UserValidation {
	/**
	 * validates the name
	 * 
	 * @param name
	 * @return
	 */
	public static boolean isValidName(String name)throws MyException {
		boolean isValid = false;

		if (name != null) {
			isValid = true;

			if (name.trim().equals("")) {
				isValid = false;
			}

			String exceptions = "!@#$%^&*()_+},=-`~{:1234567890?/><";
			int count = 0;

			for (int i = 0; i < name.trim().length(); i++) {
				char c = name.trim().charAt(i);
				for (int j = 0; j < exceptions.length(); j++) {
					char d = exceptions.charAt(j);
					if (c == d) {
						count = 1;
					}
				}
			}
			if (count == 1) {
				isValid = false;
				throw new MyException("InValid String");
			}

		}
		return isValid;

	}
	
	/**
	 * validates the age 
	 * @param age
	 * @return
	 */
	public static boolean isValidAge(int age)throws MyException {
		boolean isValid = false;
		if (age > 0 && age < 110) {
			isValid = true;
		}else
		{
			throw new MyException("InValid age");
		}
		return isValid;
	}
	
	public static boolean isValidGender(String gender )throws MyException
	{
		boolean isValid = false;
		if(gender.equals("Male")  || gender.equals("Female"))
		{
			isValid =true;
		}
		else {
			throw new MyException("InValid Gender type");
		}
		return isValid;
	}

}
