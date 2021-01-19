package model;
public class User{
	String name;
	String email;
	String dob;
	String gender;
	public User(String n,String e,String d,String g){
		this.name=n;
		this.email=e;
		this.dob=d;
		this.gender=g;
	}
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
	
}