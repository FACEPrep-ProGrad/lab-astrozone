
/*
 Progression - 1
Create a class called User inside the model package with the following arguments
String name
String email
LocalDate dob
String gender
Generate appropriate getters and setters.
Generate a 4-argument constructor in the User class.

Progression - 2
Create a class called AstroCalculator inside the service package.
Create a public method findSign of type String.
Your method takes User as input and returns a String as output.
Calculate the sign based on your birth date.
Return the output as a string.

Progression - 3
Create an object for User in AstroFormcontroller inside the controller package and pass the inputs as contructor arguments.
Create an object for User class in the AstroFormController and pass the values given above as arguments to constructor.
Create an object for the AstroCalculator class.
Call the findSign method and store the return value in a String variable called as astrosign
Bonus Challenge
Print your details like name, email, dob and gender in the console as per the format given below.
Print your current age based on dob.
Print your astrology sign.
Print the matching astrology sign

Your details
Name: FACEPrep.
Age: 4
Your Astrology: LEO.
 */
package model;
//import java.time.LocalDate;

public class User
{
	public String name, month;
	public String date;
	public String email;
	public int d;
	public int m;
	
	
	public User(String name, String month, String date)
	{
		this.name = name;
		//this.month = month;
		//this.date = date;
		d=Integer.parseInt(date);
		m=Integer.parseInt(month);
	}
}
/*	 public String getName() 
	 {
	    return this.name;
	 }
	 public void setName(String name) 
	 {
		 this.name = name;
	 }
	 
	 public String getDate() 
	 {
	    return this.date;
	 }
	 public void setDate(String date) 
	 {
		 this.date = date;
	 }
	 
	 public String getMonth() 
	 {
	    return this.month;
	 }
	 public void setMonth(String month) 
	 {
		 this.month = month;
	 }

	 @Override
	 public String toString() {
	 	return "User [name=" + name + ", month=" + month + ", dob=" + date + "]";
	 }
}
*/






































