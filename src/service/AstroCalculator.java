package service;
import model.User;
import java.time.*;

public class AstroCalculator
{
	
	
	public String findSign(User us)
	
	{
		Month mon=us.dob.getMonth();
		int month=mon.getValue();
		int dt=us.dob.getDayOfMonth();
		String zodiac=" ";
		
		if (month == 1){ 
            if (dt < 20) 
         zodiac = "Capricorn"; 
            else
            zodiac = "aquarius"; 
        } 
              
        else if (month == 2){ 
            if (dt < 19) 
            zodiac = "Aquarius"; 
            else
            zodiac = "pisces"; 
        } 
              
        else if(month == 3){ 
            if (dt < 21)  
            zodiac = "Pisces"; 
            else
           zodiac = "aries"; 
        } 
        else if (month == 4){ 
            if (dt < 20) 
            zodiac = "Aries"; 
            else
            zodiac = "taurus"; 
        } 
              
        else if (month == 5){ 
            if (dt < 21) 
            zodiac = "Taurus"; 
            else
            zodiac = "gemini"; 
        } 
              
        else if( month == 6){ 
            if (dt < 21) 
            zodiac = "Gemini"; 
            else
            zodiac = "cancer"; 
        } 
              
        else if (month == 7){ 
            if (dt < 23) 
            zodiac = "Cancer"; 
            else
            zodiac = "leo"; 
        } 
              
        else if( month == 8){ 
            if (dt < 23)  
            zodiac = "Leo"; 
            else
           zodiac = "virgo"; 
        } 
              
        else if (month == 9){ 
            if (dt < 23) 
            zodiac = "Virgo"; 
            else
           zodiac = "libra"; 
        } 
              
        else if (month == 10){ 
            if (dt < 23) 
            zodiac = "Libra"; 
            else
          zodiac= "scorpio"; 
        } 
              
        else if (month == 11){ 
            if (dt < 22) 
           zodiac = "scorpio"; 
            else
            zodiac = "sagittarius"; 
        }
        else  if (month == 12){ 
            if (dt < 22) 
            zodiac = "Sagittarius"; 
            else
            zodiac ="capricorn"; 
        } 
		return zodiac;
		
	}
}