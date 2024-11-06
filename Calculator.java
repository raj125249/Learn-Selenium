package week3Day1;

public class Calculator {								//purpose: simplicity & reusability

	public void add(int a, int b) {
			System.out.println(a+b);}
			
			
	public void add(int a, int b, int c) {
				System.out.println(a+b+c);}
				
	public void add() {
					int a=6;
					System.out.println(a);}
	
public static void main(String[] args) {
	Calculator cac = new Calculator();
	cac.add();
	cac.add(03, 90);
	cac.add(10, 60, 40);
}
}




