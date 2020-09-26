package service;

import model.User;

// Type your code
public class AstroCalculator{
	
	public  String findSign(User user) {
		
		String[] dob = user.getDob().split("-");
		
		int day = Integer.parseInt(dob[0]);
		int month = Integer.parseInt(dob[1]);
		int year = Integer.parseInt(dob[2]);
		String sign="";
		
		switch (month) {
		case 1:
			if (day < 20)
	            sign = "Capricorn";
	         else
	            sign = "Aquarius";
			break;
		

		case 2:
			if (day < 19)	
	            sign = "Aquarius";
	         else
	            sign = "Pisces";
			
			break;
		

		case 3:
			if (day < 21)
	            sign = "Pisces";
	         else
	            sign = "Aries";
			
			break;
		

		case 4:
			 if (day < 20)
		            sign = "Aries";
		         else
		            sign = "Taurus";
			
			break;
		

		case 5:
			 if (day < 21)
		            sign = "Taurus";
		         else
		            sign = "Gemini";
			
			break;
		

		case 6:
			if (day < 21)
	            sign = "Gemini";
	         else
	            sign = "Cancer";
			
			break;
		

		case 7:
			 if (day < 23)
		            sign = "Cancer";
		         else
		            sign = "Leo";
			break;
		

		case 8:
			 if (day < 23)
		            sign = "Leo";
		         else
		            sign = "Virgo";
			
			break;
		

		case 9:
			   if (day < 23)
		            sign = "Virgo";
		         else
		            sign = "Libra";
			
			break;
		

		case 10:
			 if (day < 23)
		            sign = "Libra";
		         else
		            sign = "Scorpio";
			
			break;
		

		case 11:
			if(day <= 22)
				sign =  "Scorpio";
			else if(day >= 23)
				sign =  "Sagittarius";
			break;
			
			
		

		case 12:
			if (day < 22)
	            sign = "Sagittarius";
	         else
	            sign ="Capricorn";
			
			break;
		

		default:
			break;
		}
		
		
		return sign;
		
	}
}	