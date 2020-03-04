package model;

//Type your code here

//user class
public class User
{
	public String name;
	 public int d;
	public int m;
	
	
	//method
	public User(String name,String date,String month)
	{
		this.name=name;
		d=Integer.parseInt(date);
		m=Integer.parseInt(month);
	}
	
}