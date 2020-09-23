package service;

import model.User;

public class AstroCalculator{
	String astrosign ;
	
	public String findSign(User u) {
		
		String [] dob = u.getDob().split("-");
		int date = Integer.parseInt(dob[0]);
		int month = Integer.parseInt(dob[1]);
		
		 if ((date>21 && month == 12) || (date<=19 && month== 1)){
			 astrosign = "Capricon";
	       }
	     if ((date>20 && month ==1) || (date<=18 && month == 2)){
	    	 astrosign = "Aquarius";
	       }
	     if ((date>19 && month == 2) || (date <=20 && month == 3)){
	    	 astrosign = "Pisces";
	       }
	     if ((date>21 && month == 3) || (date <=20 && month == 4)){
	    	 astrosign ="Aries";
	       }
	     if ((date>21 && month == 4) || (date <=20 && month == 5)){
	    	 astrosign ="Taurus";
	       }
	     if ((date>21 && month == 5) || (date<=20 && month == 6)){
	    	 astrosign ="Gemini";
	       }
	     if ((date>21 && month == 6) || (date<=20 && month == 7)){
	    	 astrosign = "Cancer";
	       }
	     if ((date>21 && month  == 7) || (date<=20 && month== 8)){
	    	 astrosign = "Leo";
	       }
	     if ((date>21 && month ==8) || (date<=22 && month == 9)){
	    	 astrosign ="Virgo";
	       }
	     if ((date>23 && month == 9) || (date<=20 && month ==10)){
	    	 astrosign ="Libra";
	       }
	     if ((date>21 && month == 10) || (date<=22 && month == 11)){
	    	 astrosign ="Scorpio";
	       }
	     if ((date>23 && month == 11) || (date<=20 && month == 12)){
	    	 astrosign = "Sagitarius";
	     }
	     return astrosign;
	}
	
}