package week1.day1;

public class Voidreturntype {
	
	public static void main(String[] args) {
		
		Voidreturntype V =new Voidreturntype();
		int getCarnum = V.getCarnum();
		V.printCarname();
		int sum =Voidreturntype.addTwonumbers(56,24);
		System.out.println(sum);
	}
	
			public int getCarnum() {
				System.out.println(1234);
				return 1234;
			}
			private String getCarownername() {
				return "Rajesh";
			}
			void printCarname() {
				System.out.println("Swift");
			}
			public boolean isPunctured() {
				return false;
			}
			public static int addTwonumbers(int num1, int num2) {
				return num1+num2;
			}
			public int subtwonumbers(int num1, int num2) {
				return num2-num1;
			}
			public int mulThreenums(int num1, int num2, int num3){
				return num1*num2*num3;
			}
			public int divtwonum(int num1, int num2) {
				return num1/num2;
			}	
}