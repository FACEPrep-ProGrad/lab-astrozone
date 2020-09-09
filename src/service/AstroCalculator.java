package service;

import model.User;
// Type your code

public class AstroCalculator{
	
	public String findSign(User user) {
		
		String[] dob = user.getDob().split("-");
		
		int date = Integer.parseInt(dob[0]);
		int month = Integer.parseInt(dob[1]);
		
		String sign = null;
		
		switch(month) {
		
		case 1:
			if(date >= 21)
				sign =  "Aquarius";
			else if(date <= 20)
				sign =  "Capricon";
			break;
				
		case 2:
			if(date >= 19)
				sign =  "Pisces";
			else if(date <= 18)
				sign =  "Aquarius";
			break;
		
		case 3:
			if(date >= 21)
				sign =  "Aries";
			else if(date <= 20)
				sign =  "Pisces";
			break;
			
		case 4:
			if(date >= 21)
				sign =  "Taurus";
			else if(date <= 20)
				sign =  "Aries";
			break;
			
		case 5:
			if(date <= 21)
				sign =  "Taurus";
			else if(date >= 22)
				sign =  "Gemini";
			break;
			
		case 6:
			if(date <= 21)
				sign =  "Gemini";
			else if(date >= 22)
				sign =  "Cancer";
			break;
			
		case 7:
			if(date <= 22)
				sign =  "Cancer";
			else if(date >= 23)
				sign =  "Leo";
			break;
			
		case 8:
			if(date <= 23)
				sign =  "Leo";
			else if(date >= 24)
				sign =  "Virgo";
			break;
			
		case 9:
			if(date <= 22)
				sign =  "Virgo";
			else if(date >= 23)
				sign =  "Libra";
			break;
			
		case 10:
			if(date <= 23)
				sign =  "Libra";
			else if(date >= 24)
				sign =  "Scorpio";
			break;
			
		case 11:
			if(date <= 22)
				sign =  "Scorpio";
			else if(date >= 23)
				sign =  "Sagittarius";
			break;
			
		case 12:
			if(date <= 21)
				sign =  "Sagittarius";
			else if(date >= 22)
				sign =  "Capricorn";
			break;
		
		}
		
		return sign;
	}
}