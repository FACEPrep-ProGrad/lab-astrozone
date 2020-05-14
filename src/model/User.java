package model;

public class User{
	public String name;
	public String email;
	public String gender;
	 public int d;
	public int m;
	
	
	
	public User(String name,String date,String month)
	{
		this.name=name;
		d=Integer.parseInt(date);
		m=Integer.parseInt(month);
	}
}