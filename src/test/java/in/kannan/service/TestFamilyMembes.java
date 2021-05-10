package in.kannan.service;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


public class TestFamilyMembes {
	/**
	 * tests the 
	 */

	@Test
	public void testFamilyMembers() {
		
		List<String> familyDetails = MemberDetail.getFamilyMembers();
		assertEquals(3, familyDetails.size());
	}

}
