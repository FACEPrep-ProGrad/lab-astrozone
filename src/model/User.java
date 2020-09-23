package model;

import java.time.LocalDate;

//Type your code here
/*Create a class called User inside the model package with the following arguments
String name
String email
LocalDate dob
String gender
Generate appropriate getters and setters.
Generate a 4-argument constructor in the User class.*/

public class User{
	String name;
	String email;
	public LocalDate dob;
	String gender;
	
	public void setname(String name) {
		this.name=name;
	}
	public void getname() {
		System.out.println(name);
	}
	
	public void setemail(String email) {
		this.email=email;
	}
	public void getemail() {
		System.out.println(email);
	}
	
//	public void setdob(LocalDate dob) {
//		this.dob=dob;
//	}
//	public void getdob() {
//		System.out.println(dob);
//	}
	
	public void setgender(String gender) {
		this.gender=gender;
	}
	public void getgender() {
		System.out.println(gender);
	}
	
	public User(String name,String date,String gender){
		setname(name);
		//setemail(email);
		this.dob=LocalDate.parse(date);
		setgender(gender);
	}
}