package model;
import java.time.LocalDate;

public class User
{
	private String name;
	private String email;
	public LocalDate dob;
	private String gender;
	
	public User(String name,String email,String dob,String gender)
	{
		setName(name);
		setEmail(email);
		this.dob=LocalDate.parse(dob);
		this.gender=gender;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public void setgender(String gender) {
		this.gender=gender;
	}
	public String getgender() {
		return gender;
	}
	
}