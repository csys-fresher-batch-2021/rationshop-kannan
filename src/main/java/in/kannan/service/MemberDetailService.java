package in.kannan.service;

import java.util.ArrayList;
import java.util.List;

public class MemberDetailService {
	
	private static final List<String> familyMembers= new ArrayList<String> ();
	
	static
	{
		familyMembers.add("Ramachandran");
		familyMembers.add("Vairam");
		familyMembers.add("Kannan");
	}
	/*
	 * returns the name of the members 
	 */
	
	public static List<String> getFamilyMembers()
	{
		return familyMembers;
	}
	

}
