package service;

import model.User;

public class AstroCalculator{
	public String findSign(User u) {
		String[] listDob=(u.getDob()).split("-");
		int day=Integer.parseInt(listDob[0]);
		int month=Integer.parseInt(listDob[1]);
		String astro_sign="";           
        if (month == 1){ 
            if (day < 20) 
            astro_sign = "Capricorn"; 
            else
            astro_sign = "Aquarius"; 
        } 
              
        else if (month == 2){ 
            if (day < 19) 
            astro_sign = "Aquarius"; 
            else
            astro_sign = "Pisces"; 
        } 
              
        else if(month == 3){ 
            if (day < 21)  
            astro_sign = "Pisces"; 
            else
            astro_sign = "Aries"; 
        } 
        else if (month == 4){ 
            if (day < 20) 
            astro_sign = "Aries"; 
            else
            astro_sign = "Taurus"; 
        } 
              
        else if (month == 5){ 
            if (day < 21) 
            astro_sign = "Taurus"; 
            else
            astro_sign = "Gemini"; 
        } 
              
        else if( month == 6){ 
            if (day < 21) 
            astro_sign = "Gemini"; 
            else
            astro_sign = "Cancer"; 
        } 
              
        else if (month == 7){ 
            if (day < 23) 
            astro_sign = "Cancer"; 
            else
            astro_sign = "Leo"; 
        } 
              
        else if( month == 8){ 
            if (day < 23)  
            astro_sign = "Leo"; 
            else
            astro_sign = "Virgo"; 
        } 
              
        else if (month == 9){ 
            if (day < 23) 
            astro_sign = "Virgo"; 
            else
            astro_sign = "Libra"; 
        } 
              
        else if (month == 10){ 
            if (day < 23) 
            astro_sign = "Libra"; 
            else
            astro_sign = "Scorpio"; 
        } 
              
        else if (month == 11){ 
            if (day < 22) 
            astro_sign = "Scorpio"; 
            else
            astro_sign = "Sagittarius"; 
        } 
        else if (month == 12){ 
            
            if (day < 22) 
            astro_sign = "Sagittarius"; 
            else
            astro_sign ="Capricorn"; 
        } 
           
		
		
		System.out.println(listDob[0]+" "+listDob[1] +" "+listDob[2]);
		
		return astro_sign;
		
	}
	
	
}
