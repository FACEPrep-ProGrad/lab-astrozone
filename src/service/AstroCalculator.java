package service;

//Progression -2
import java.util.Calendar;
import model.User;

public class AstroCalculator{
	
	public String findSign(User user) {
		
			String dob=user.getDob();
			if(dob==null)
			{
				System.out.println("Invalid Input for Date of Birth");
				return "Invalid Input for Date of Birth";
			}
			int day=Integer.parseInt(dob.substring(0, 2));
			int month=Integer.parseInt(dob.substring(3,5));
			
			String sign="";
			
			if (month == 1) {
		         if (day < 20)
		            sign = "Capricorn";
		         else
		            sign = "Aquarius";
		      }
		      else if (month == 2) {
		         if (day < 19)
		            sign = "Aquarius";
		         else
		            sign = "Pisces";
		      }
		      else if(month == 3) {
		         if (day < 21)
		            sign = "Pisces";
		         else
		            sign = "Aries";
		      }
		      else if (month == 4) {
		         if (day < 20)
		            sign = "Aries";
		         else
		            sign = "Taurus";
		      }
		      else if (month == 5) {
		         if (day < 21)
		            sign = "Taurus";
		         else
		            sign = "Gemini";
		      }
		      else if( month == 6) {
		         if (day < 21)
		            sign = "Gemini";
		         else
		            sign = "Cancer";
		      }
		      else if (month == 7) {
		         if (day < 23)
		            sign = "Cancer";
		         else
		            sign = "Leo";
		      }
		      else if( month == 8) {
		         if (day < 23)
		            sign = "Leo";
		         else
		            sign = "Virgo";
		      }
		      else if (month == 9) {
		         if (day < 23)
		            sign = "Virgo";
		         else
		            sign = "Libra";
		      }
		      else if (month == 10) {
		         if (day < 23)
		            sign = "Libra";
		         else
		            sign = "Scorpio";
		      }
		      else if (month == 11) {
		         if (day < 22)
		            sign = "Scorpio";
		         else
		            sign = "Sagittarius";
		      }
		      else if (month == 12) {
		         if (day < 22)
		            sign = "Sagittarius";
		         else
		            sign ="Capricorn";
		      }
			
		     return sign;
	
	}
	
	//Bonus Challenge
	public static void main(String args[])
	{
		User ProGrad=new User("Rhea Sudesh","rheasudesh@gmail.com","30-04-1999","female");
		AstroCalculator astro_cal = new AstroCalculator();
		int current_year = Calendar.getInstance().get(Calendar.YEAR);
		
		int ProGrad_age=current_year-Integer.parseInt(ProGrad.getDob().substring(6));
		
		System.out.println("Your Details:\n Name : "+ProGrad.getName()+"\n Age : "+ProGrad_age+"\n Your Astrology : "+astro_cal.findSign(ProGrad));

	
	}
	
	
}