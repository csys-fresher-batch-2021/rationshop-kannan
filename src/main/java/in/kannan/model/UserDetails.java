package in.kannan.model;

public class UserDetails {

	// Declaration of variables private
	private String name;
	private int age;
	private String gender;

	// 3 argument constructor
	public UserDetails(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

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

	// returns the User gender
	public String getGender() {
		return this.gender;
	}

	// Sets the name
	public  void setName(String name1) {
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

	// trString method declaration
	public String toString() {
		return "User Name: " + name + " ,User age:" + age + " ,User gender:" + gender;
	}

}
