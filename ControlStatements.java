package week1.day1;
public class ControlStatements {
	public static void main(String[] args) {

		// if and else case statement.	
			int age=42;
			
	if (age<=30) {
	System.out.println("eligible to appeal for vote " + age);
	}else if (age>=30) {
		System.out.println("appeal to vote");
		}
	else  if (age>40 && 45<age) {
			System.out.println("appeal");
		}else
			System.out.println(age+ " not eligible to appeal vote");
 
	//switch case statement	
	char value='B';
	 switch (value) {
	 	case 'a' : 
	 		System.out.println("print alphabetic class");
	break;
		case 'A' : 
			System.out.println("print caps alphabetic class");
	break;
		case '@': 
			System.out.println("print special class");
	break;
			default: System.out.println("no vlaue is registered");
	 	}	
	}
}