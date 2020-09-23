package service;

import model.User;


/*Create a class called AstroCalculator inside the service package.
Create a public method findSign of type String.
Your method takes User as input and returns a String as output.
Calculate the sign based on your birth date.
Return the output as a string.*/

public class AstroCalculator {
	public String findSign(User user) {
		String birth_date[] = user.getDob().split("-");
		System.out.println(birth_date);
		int day = Integer.parseInt(birth_date[0]);
		int month = Integer.parseInt(birth_date[1]);
		
		
		String zodiac_sign; 
	    
	    if (month == 12){ 
	        if (day < 22) 
	        	zodiac_sign = "Sagittarius"; 
	        else
	        	zodiac_sign ="Capricorn"; 
	    } 
	          
	    else if (month == 1){ 
	        if (day < 20) 
	        	zodiac_sign = "Capricorn"; 
	        else
	        	zodiac_sign = "Aquarius"; 
	    } 
	          
	    else if (month == 2){ 
	        if (day < 19) 
	        	zodiac_sign = "Aquarius"; 
	        else
	        	zodiac_sign = "Pisces"; 
	    } 
	          
	    else if(month == 3){ 
	        if (day < 21)  
	        	zodiac_sign = "Pisces"; 
	        else
	        	zodiac_sign = "Aries"; 
	    } 
	    else if (month == 4){ 
	        if (day < 20) 
	        	zodiac_sign = "Aries"; 
	        else
	        	zodiac_sign = "Taurus"; 
	    } 
	          
	    else if (month == 5){ 
	        if (day < 21) 
	        	zodiac_sign = "Taurus"; 
	        else
	        	zodiac_sign = "Gemini"; 
	    } 
	          
	    else if( month == 6){ 
	        if (day < 21) 
	        	zodiac_sign = "Gemini"; 
	        else
	        	zodiac_sign = "Cancer"; 
	    } 
	          
	    else if (month == 7){ 
	        if (day < 23) 
	        	zodiac_sign = "Cancer"; 
	        else
	        	zodiac_sign = "Leo"; 
	    } 
	          
	    else if( month == 8){ 
	        if (day < 23)  
	        	zodiac_sign = "Leo"; 
	        else
	        	zodiac_sign = "Virgo"; 
	    } 
	          
	    else if (month == 9){ 
	        if (day < 23) 
	        	zodiac_sign = "Virgo"; 
	        else
	        	zodiac_sign = "Libra"; 
	    } 
	          
	    else if (month == 10){ 
	        if (day < 23) 
	        	zodiac_sign = "Libra"; 
	        else
	        	zodiac_sign = "Scorpio"; 
	    } 
	          
	    else if (month == 11){ 
	        if (day < 22) 
	        	zodiac_sign = "Scorpio"; 
	        else
	        	zodiac_sign = "Sagittarius"; 
	    } 
	   return zodiac_sign;
	} 
			
	}
