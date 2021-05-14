package in.kannan.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidation {
	/**
	 * validates the name 
	 * @param name
	 * @return
	 */
	public static boolean isValidName(String name) {
		boolean isValid = false;
		if (notNull(name)) {

			Pattern p = Pattern.compile("^[A-Za-z\s]+$");
			Matcher m = p.matcher(name);

			if (m.matches()) {
				isValid = true;
			}
		}
		return isValid;

	}
	/**
	 * Validates null in string
	 * @param name
	 * @return
	 */

	public static boolean notNull(String name) {

		boolean isValid = true;
		if (name == null || name.trim().equals(""))// correct
		{
			isValid = false;
		}
		return isValid;
	}

}
