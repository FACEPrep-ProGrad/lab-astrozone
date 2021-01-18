package service;

import model.User;
public class AstroCalculator{
	
	public String zodiacSign(int date,int month)
	{
		if(month==12&&date>21||month==1&&date<21)
			return "Capricon";
		if(month==1&&date>=21||month==2&&date<19)
			return "Aquarius";
		if(month==2&&date==19||month==3&&date<21)
			return "Pisces";
		if(month==3&&date>=21||month==4&&date<21)
			return "Aries";
		if(month==4&&date>=21||month==5&&date<=21)
			return "Taurus";
		if(month==5&&date>21||month==6&&date<=21)
			return "Gemini";
		if(month==6&&date>21||month==7&&date<23)
			return "Cancer";
		if(month==7&&date>22||month==8&&date<24)
			return "Leo";
		if(month==8&&date>23||month==9&&date<23)
			return "Virgo";
		if(month==9&&date>22||month==10&&date<24)
			return "Libra";
		if(month==10&&date>23||month==11&&date<23)
			return "Scorpio";
		return "Sagittarius";
	}
	public String findSign(User user) {
		//Using getter method to get the date of birth
		if(user.getDob()==null||user.getEmail()==null||user.getGender()==null
				||user.getName()==null)
			return "Enter valid details";
		String dob=user.getDob();
		
		//split the date of birth into date, month and year
		String[] dobArray=dob.split("-");
		
		//find date and month from date of birth
		int date=Integer.parseInt(dobArray[0]);
		int month=Integer.parseInt(dobArray[1]);
		
		return zodiacSign(date,month);
	}
}