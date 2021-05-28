package in.kannan.validation;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kannan.exception.ValidationException;

public class isValidityTest {
	/**
	 * test case with correct user name
	 * @throws ValidationException 
	 */

	@Test
	public void testWithCorrectUserName1() throws ValidationException {
		boolean isCorrect =UserValidation.isValidName("kannan");
		assertTrue(isCorrect);
	}
	
	/**
	 * test case with incorrect user name
	 * @throws ValidationException 
	 */
	
	@Test
	public void testWithInCorrectUserName2() throws ValidationException {
		boolean isCorrect =UserValidation.isValidName("ka19an");
		assertFalse(isCorrect);
	}
	
	/**
	 * test case with correct user age
	 * @throws ValidationException 
	 */
	
	@Test
	public void testWithCorrectUserAge3() throws ValidationException {
		boolean isCorrect = UserValidation.isValidUserId(50);
		assertTrue(isCorrect);
	}
	
	/**
	 * test case with incorrect user age
	 * @throws ValidationException 
	 */
	
	@Test
	public void testWithInCorrectUserAge4() throws ValidationException {
		boolean isCorrect = UserValidation.isValidUserId(-18);
		assertFalse(isCorrect);;
	}
	
	/**
	 * test case with correct user gender
	 * @throws ValidationException 
	 */
	
	@Test
	public void testWithCorrectUserGender5() throws ValidationException {
		boolean isCorrect = UserValidation.isValidGender("Male");
		assertTrue(isCorrect);
		
	}
	

	/**
	 * test case with correct user gender
	 * @throws ValidationException 
	 */
	
	@Test
	public void testWithInCorrectUserGender6() throws ValidationException {
		boolean isCorrect =UserValidation.isValidGender("MAle");
		assertFalse(isCorrect);;
	}


}
