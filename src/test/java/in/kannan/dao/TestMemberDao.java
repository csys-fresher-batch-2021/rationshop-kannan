package in.kannan.dao;

import java.util.List;

import in.kannan.model.UserDetails;

public class TestMemberDao {
	public static void main(String[] args) throws Exception {
		List<UserDetails> user = RationShopUserDisplayDAO.getAllUsers();
		 
		//Display all products
		for (UserDetails userDetails : user) {
			System.out.println(userDetails);
			
		}
		
	}

}
