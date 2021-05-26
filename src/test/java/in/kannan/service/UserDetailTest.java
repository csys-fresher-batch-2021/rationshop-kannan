package in.kannan.service;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kannan.exception.MyException;

public class UserDetailTest {
	/**
	 * test with correct user details
	 * 
	 * @throws MyException
	 */

	@Test
	public void correctUserDetailTest1() throws MyException  {

		boolean status = UserDetailService.isValidUser("kannan", 12, "Male");

		assertTrue(status);
	}

	/**
	 * test with incorrect user details
	 * 
	 * @throws MyException
	 */

	@Test
	public void IncorrectUserDetailTest2() throws MyException {

		try {
			boolean status = UserDetailService.isValidUser("kan98nan", 20, "Male");
			assertFalse(status);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
