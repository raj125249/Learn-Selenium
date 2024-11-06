package week1.day1;

public class Switchcase {

	public static void main(String[] args) {
		// using if else statement in the switch case.
		int a=20;
		
			switch (a) {
			case 35: System.out.println("smaller than 40");
				break;
			case 25: System.out.println("smaller than 30");
				break;
			default: 
				System.out.println("not registered");
				}
			{
			System.out.println("greater than 40");	}

		// validating the string value.

		String value ="seconclass";
switch (value) {
		case "firstclass": System.out.println("balcony");
			break;
		case "secondclass": System.out.println("midseat");
			break;
		case "thirdclass": System.out.println("mid2seat");
			default:
				System.out.println("low class");
		}
	}
}