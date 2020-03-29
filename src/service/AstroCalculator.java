package service;
//import java.time.LocalDate;

import model.User;
// Type your code
public class AstroCalculator{
	public String findSign(User u) {
		
		int month=u.getMonth();
		int date1 = u.getDate();
		if ((date1>21 && month == 12) || (date1<=19 && month== 1)){
	           return  "Capricon";
	       }
	       if ((date1>20 && month ==1) || (date1<=18 && month == 2)){
	           return "Aquarius";
	       }
	       if ((date1>19 && month == 2) || (date1<=20 && month == 3)){
	           return "Pisces";
	       }
	       if ((date1>21 && month == 3) || (date1<=20 && month == 4)){
	           return "aries";
	       }
	       if ((date1>21 && month == 4) || (date1<=20 && month == 5)){
	           return "Taurus";
	       }
	       if ((date1>21 && month == 5) || (date1<=20 && month == 6)){
	           return "Gemini";
	       }
	       if ((date1>21 && month == 6) || (date1<=20 && month == 7)){
	           return "Cancer";
	       }
	       if ((date1>21 && month  == 7) || (date1<=20 && month== 8)){
	           return "Leo";
	       }
	       if ((date1>21 && month ==8) || (date1<=22 && month == 9)){
	           return "Virgo";
	       }
	       if ((date1>23 && month == 9) || (date1<=20 && month ==10)){
	           return "Libra";
	       }
	       if ((date1>21 && month == 10) || (date1<=22 && month == 11)){
	           return "Scorpio";
	       }
	       if ((date1>23 && month == 11) || (date1<=20 && month == 12)){
	           return "Sagitarius";
	       }
	       else
	    	   return "please enter all the values";
		
	}
}