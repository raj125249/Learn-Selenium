package week3Day1;

public class ReverseString {

	public static void main(String[] args) {
		
//pseudocode
		{
		String name ="Subraja"; 
		
		char[] charArray = name.toCharArray();					// convert string to an chararray
		for (int i = charArray.length-1 ; i >=0; i--) {			//reverse the string via iterate loop
				System.out.print(charArray[i]);}				//print it
			}	

//palindrome
		
		{			
			String name1 = "madam";   String name2 ="";				//create string and empty string
			
			char[] ch = name1.toCharArray();								// convert string to chararray
			
			for (int i = ch.length-1; i >=0 ; i--) {							// reverse the string
/*debug*/	name2=name2+ch[i];							//add the reversed string with  the empty string(no need of output so we add the empty string and string)
			}
			System.out.println(name2);
			if (name1.equals(name2)) {													//compare and check
				System.out.println("the given string "+name1+ " is palindrome");
			}
			else {
				System.out.println("no an palindrome");
			}																				
		}
		
// palindrome in upper or lower case
				
		{
			String name1 = "Madam";   
			name1=name1.toUpperCase();			// change the variable to uppercase and import to same variable
			
			String name2 ="";				//create string and empty string
			
			char[] ch = name1.toCharArray();								// convert string to chararray
			
			for (int i = ch.length-1; i >=0 ; i--) {							// reverse the string
/*debug*/	name2=name2+ch[i];							//add the reversed string with  the empty string(no need of output so we add the empty string and string)
			}
			System.out.println(name2);
			if (name1.equals(name2)) {													//compare and check
				System.out.println("the given string "+name1+ " is palindrome");
			}
			else {
				System.out.println("no an palindrome");
			}							
		}
		
		{
			
					
			
			
			
		}
		
		
		
		
		
	}
}