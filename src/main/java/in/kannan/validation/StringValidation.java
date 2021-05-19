package in.kannan.validation;

public class StringValidation {
	/**
	 * validates the name
	 * 
	 * @param name
	 * @return
	 */
	public static boolean isValidName(String name) {
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
			}

		}
		return isValid;

	}

}
