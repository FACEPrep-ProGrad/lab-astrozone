package service;

//import java.time.LocalDate;

import model.User;

public class AstroCalculator{
	public String findSign(User user) {
		String sign ="";
		String dob = user.getDob();
		String dateArr[] = dob.split("-");
		int day = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]);
		if(month==3) {
			if(day<=21)
				sign="Pisces";
			else
				sign = "Aries";
		}
		else if(month==4) {
			if(day<=20) 
				sign="Aries";
			else
				sign = "Taurus";
		}
		else if(month==5) {
			if(day<=20)
				sign = "Taurus";
			else
				sign = "Gemini";
		}
		else if(month==6) {
			if(day<=21)
				sign = "Gemini";
			else
				sign = "Cancer";
		}
		else if(month==7) {
			if(day<=22)
				sign = "Cancer";
			else
				sign = "Leo";
		}
		else if(month==8) {
			if(day<=22)
				sign = "Leo";
			else
				sign = "Virgo";
		}
		else if(month==9) {
			if(day<=22)
				sign = "Virgo";
			else
				sign = "Libra";
		}
		else if(month==10) {
			if(day<=23)
				sign = "Libra";
			else
				sign = "Scorpio";
		}
		else if(month==11) {
			if(day<=21)
				sign = "Scorpio";
			else
				sign = "Sagittarius";
		}
		else if(month==12) {
			if(day<=21)
				sign = "Sagittarius";
			else
				sign = "Capricorn";
		}
		else if(month==1) {
			if(day<=19)
				sign = "Capricorn";
			else
				sign = "Aquarius";
		}
		else if(month==2) {
			if(day<=18)
				sign = "Aquarius";
			else
				sign = "Pisces";
		}
		return sign;
		
	}
	
}

// 5 6 7 8 9 10 11 12 1 2