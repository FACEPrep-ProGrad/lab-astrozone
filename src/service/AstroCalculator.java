package service;
import model.User;
// Type your code
public class AstroCalculator{
public String findSign(User user) {
	switch(user.getDob().substring(3, 5)) {
		case "01":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Aquarius";
		case "02":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Capricorn";
		case "03":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Cancer";
		case "04":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Aries";
		case "05":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Gemini";
		case "06":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Leo";
		case "07":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Libra";
		case "08":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Pisces";
		case "09":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Sagittarius";
		case "10":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Taurus";
		case "11":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Scorpio";
		case "12":System.out.println("substring captured" + user.getDob().substring(3, 5));return "Virgo";
		default:System.out.println("substring captured" + user.getDob().substring(3, 5));return "Scorpio";
	}
	}
}