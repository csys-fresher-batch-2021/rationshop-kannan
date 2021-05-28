package in.kannan.validation;

import in.kannan.exception.ValidationException;

public class UserValidation {
	private UserValidation() {
		super();
	}
	/**
	 * validates the name
	 * 
	 * @param name
	 * @return
	 */
	public static boolean isValidName(String name)throws ValidationException {
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
				
				throw new ValidationException("InValid String");
			}

		}
		return isValid;

	}
	
	/**
	 * validates the age 
	 * @param userId
	 * @return
	 */
	public static boolean isValidUserId(int userId)throws ValidationException {
		boolean isValid = false;
		if (userId > 1000 && userId < 10000) {
			isValid = true;
		}else
		{
			throw new ValidationException("InValid age");
		}
		return isValid;
	}
	
	public static boolean isValidGender(String gender )throws ValidationException
	{
		boolean isValid = false;
		if(gender.equals("Male")  || gender.equals("Female"))
		{
			isValid =true;
		}
		else {
			throw new ValidationException("InValid Gender type");
		}
		return isValid;
	}

}
