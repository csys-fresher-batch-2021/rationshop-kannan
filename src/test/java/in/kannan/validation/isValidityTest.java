package in.kannan.validation;

import static org.junit.Assert.*;

import org.junit.Test;

public class isValidityTest {
	/**
	 * test case with correct user name
	 */

	@Test
	public void testWithCorrectUserName1() {
		boolean isCorrect =UserValidation.isValidName("kannan");
		assertTrue(isCorrect);
	}
	
	/**
	 * test case with incorrect user name
	 */
	
	@Test
	public void testWithInCorrectUserName2() {
		boolean isCorrect =UserValidation.isValidName("ka19an");
		assertFalse(isCorrect);
	}
	
	/**
	 * test case with correct user age
	 */
	
	@Test
	public void testWithCorrectUserAge3() {
		boolean isCorrect = UserValidation.isValidAge(50);
		assertTrue(isCorrect);
	}
	
	/**
	 * test case with incorrect user age
	 */
	
	@Test
	public void testWithInCorrectUserAge4() {
		boolean isCorrect = UserValidation.isValidAge(-18);
		assertFalse(isCorrect);;
	}
	
	/**
	 * test case with correct user gender
	 */
	
	@Test
	public void testWithCorrectUserGender5() {
		boolean isCorrect = UserValidation.isValidGender("Male");
		assertTrue(isCorrect);
		
	}
	

	/**
	 * test case with correct user gender
	 */
	
	@Test
	public void testWithInCorrectUserGender6() {
		boolean isCorrect =UserValidation.isValidGender("MAle");
		assertFalse(isCorrect);;
	}


}
