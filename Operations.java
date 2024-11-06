package week1.day1;

public class Operations {

	public static void main(String[] args) {
		
		int a=4;
		int b=10;
		int c=15;
// arithmetic operators  +, -, *, /, % //
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*c);
		System.out.println(c/a);
		System.out.println(c%a);	
		
		int i=200;
		System.out.println(i*50);
		
		
// relational or comparison operators  ==, !=, <, <=, >, >=, //	
		
		if ((a+b)==c) {
			System.out.println((a+b) +" = to "+c);}
		else if((a+b)!=c) {
				System.out.println((a+b)+" not = to "+c);}
		
// logical operators  &&-> and, ||-> or, !-> not		
		
		int x=18;
		if (x<=18 && x==30) {
			System.out.println("semi adult");
		}else { if (x>30 || x <50 ) {
			System.out.println("adult");
		}			
		
		int k=3;
		System.out.println(--k);
		}
	}
}