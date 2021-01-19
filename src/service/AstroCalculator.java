package service;

import model.User;

public class AstroCalculator{
	public String findSign(User user) {
		String dob=user.getDob();
		if (dob == null) {
			System.out.println( "No Date of Birth Given To Calculate Astro Sign");
			return "";
		}
		int day=Integer.parseInt(dob.substring(0, 2));
		int month=Integer.parseInt(dob.substring(3,5));
		switch(month) {
		case 12:if (day < 22)
					return "Sagittarius";
				else
					return "Capricorn";
		case 11:if (day < 22)
					return "Scorpio";
				else
					return "Sagittarius";
		case 10:if (day < 23)
					return "Libra";
				else
					return "Scorpio";
		case 9:if (day < 23)
					return "Virgo";
				else
					return "Libra";
		case 8:if (day < 23)
					return "Leo";
				else
					return "Virgo";
		case 7:if (day < 23)
					return "Cancer";
				else
					return "Leo";
		case 6:if (day < 21)
					return "Gemini";
				else
					return "Cancer";
		case 5:if (day < 21)
					return "Taurus";
				else
					return "Gemini";
		case 4:if (day < 20)
					return "Aries";
				else
					return "Taurus";
		case 3:if (day < 21)
					return "Pisces";
				else
					return "Aries";
		case 2:if (day < 19)
					return "Aquarius";
				else
					return "Pisces";
		case 1:if (day < 22)
					return "Capricorn";
				else
					return "Aquarius";
		}
		return " ";
	}
} 