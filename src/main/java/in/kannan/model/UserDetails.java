package in.kannan.model;

public class UserDetails {

	// Declaration of variables private
	private int idNo;
	private String name;
	private int age;
	private int userId;
	private String gender;

	// 3 argument constructor
	public UserDetails(String name, int userId) {
		this.name = name;
		this.userId = userId;

	}

	public UserDetails(int idNo, String name, int userId) {
		super();
		this.setIdNo(idNo);
		this.name = name;
		this.userId = userId;
	}

	// returns the User name
	/**
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	// returns the User age
	public int getAge() {
		return this.age;
	}

	// returns the User age
	public int getUserId() {
		return this.userId;
	}

	// returns the User gender
	public String getGender() {
		return this.gender;
	}

	// Sets the name
	public void setName(String name1) {
		this.name = name1;
	}

	// Sets the name
	public void setAge(int age1) {
		this.age = age1;
	}

	// Sets the name
	public void setGender(String gender1) {
		this.gender = gender1;
	}

	// Sets the name
	public void setUserId(int userId1) {
		this.userId = userId1;
	}

	// trString method declaration
	public String toString() {
		return "User Name: " + name + ",User UserId" + userId;
	}

	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}


}
