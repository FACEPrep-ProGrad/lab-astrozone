package model;

public class User{
	
	String name;
	String email;
	String dob;
	String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public User(String name, String email, String dob, String gender) {
		
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	public User(String name2, String dob2, String gender2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
		this.dob = dob2;
		this.gender = gender2;
	}
	
}
