package week3Day1;

public class LearnString {											//String str = new String();									//heap memory

	public static void main(String[] args) {
		String str1 = "Testleaf";  String str2 = "Testleaf";
		
//method 1: LENGTH 				to find length of string
		int length = str1.length();						//find the length method, ctrl+2,l
		System.out.println("length of string "+str1+" is: " +length);
		
//method 2: CHAR ARRAY			 to convert string to character array
		char[] charArray = str1.toCharArray();        //find the tochararray method, ctrl+2,l
			System.out.println(charArray[3]);
		
				for (int i = 0; i < charArray.length; i++) {	// to print all the characters in array or string
						System.out.println(charArray[i]);
				}
				// reverse of string
				for (int i = charArray.length-1; i>=0 ; i --) {
					System.out.print(charArray[i]);}
	
//method 3: CHECK condition			to check whether Test is inside the String str1
				boolean contains = str1.contains("Test");			// contains method, ctrl+2,L							
				System.out.println(contains);
		
		if (str1.contains("Leaf") || str1.contains("leaf")) {
			System.out.println("is present");
		}
		if (str1.contains("Test") && str1.contains("leaf")) {
			System.out.println("is available");
		}
		else {
			System.out.println("no");
		}
//method 4: To compare 2 strings we use  methods(equals or equalsignorecase)	
						// equals() -- will check the content inside it
						//     ==      will check for the memeory value.
		
		//String str1 = "Testleaf";  String str2 = "Testleaf";
		boolean equals = str1.equals(str2);						// 1stvariable.equals(2nd variable) method, ctrl+2,L
		System.out.println(equals);
		//String str1 = "Testleaf";  String str2 = "testleaf";
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);		
		System.out.println(equalsIgnoreCase);
		
// method 5: check for index		
		int indexOf = str1.indexOf("s");	// call indexOf(int ch) method, ctrl+2,L
		System.out.println(indexOf);
		
// substring means continue of place where we chooose to till end include space.	
		String substring = str1.substring(4);		// call substring(beginindex) method, ctrl+2,l
		System.out.println(substring);		//output: leaf.
		
		String substring2 = str2.substring(2, 4);		// call substring(beginindex, endindex) method, ctrl+2,l
		System.out.println(substring2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
