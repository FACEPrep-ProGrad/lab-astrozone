package service;

import model.User;

// Type your code

public class AstroCalculator{
	public String toString(User user) {
		return user.getName()+user.getGender()+user.getDob();
	}
	public String findSign(User user) {
		String[] dob = user.getDob().split("-");
		
		int date = Integer.parseInt(dob[0]);
		int month = Integer.parseInt(dob[1]);
		
		String sign = null;
		
		switch(month) {
		
		case 1:
			if(date >= 21)
				sign =  "Aquarius";
			else
				sign =  "Capricon";
			break;
				
		case 2:
			if(date >= 19)
				sign =  "Pisces";
			else
				sign =  "Aquarius";
			break;
		
		case 3:
			if(date >= 21)
				sign =  "Aries";
			else
				sign =  "Pisces";
			break;
			
		case 4:
			if(date >= 21)
				sign =  "Taurus";
			else
				sign =  "Aries";
			break;
			
		case 5:
			if(date <= 21)
				sign =  "Taurus";
			else
				sign =  "Gemini";
			break;
			
		case 6:
			if(date <= 21)
				sign =  "Gemini";
			else
				sign =  "Cancer";
			break;
			
		case 7:
			if(date <= 22)
				sign =  "Cancer";
			else
				sign =  "Leo";
			break;
			
		case 8:
			if(date <= 23)
				sign =  "Leo";
			else
				sign =  "Virgo";
			break;
			
		case 9:
			if(date <= 22)
				sign =  "Virgo";
			else
				sign =  "Libra";
			break;
			
		case 10:
			if(date <= 23)
				sign =  "Libra";
			else
				sign =  "Scorpio";
			break;
			
		case 11:
			if(date <= 22)
				sign =  "Scorpio";
			else
				sign =  "Sagittarius";
			break;
			
		case 12:
			if(date <= 21)
				sign =  "Sagittarius";
			else
				sign =  "Capricorn";
			break;
		
		}
		return sign;
//		return sign;
	}
}