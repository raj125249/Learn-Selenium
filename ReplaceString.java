package week3Day1;

public class ReplaceString {

	public static void main(String[] args) {
		
		String name="Chennai 500571";
		
//print only characters
			String city = name.replaceAll("[^a-zA-Z]", "");			//call method replaceall ("[^ ]" , ""), ctrl+2,L
			System.out.println(city);
			
//print only numbers			
			String number = name.replaceAll("[^0-9]", "");		//call method replaceall ("[^ ]" , ""), ctrl+2,L
			System.out.println(number);
			
//pring only number via substring
			String name1 = name.substring(8);	
			System.out.println(name1);
			
// to convert string to int means change in datatype
			int parseInt = Integer.parseInt(number);			//call a method Interger.parseint(), ctrl+2,L
			System.out.println(parseInt);
			
			long pars = Long.parseLong(number);
			System.out.println(pars);
			

	}
}
