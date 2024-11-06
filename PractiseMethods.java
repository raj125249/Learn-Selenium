package week1.day1;

public class PractiseMethods {
	
	public static void main(String[] args) {
		
		// classname obj = new classname();
		
		PractiseMethods obj = new PractiseMethods();
		
		int num = obj.getCarregistrationnum();
		System.out.println(num);
				
		String name = obj.getOwnername();
		System.out.println(name);
	
		obj.printCarmodel();
		
		/*obj.isPunctured();  	*/		boolean punctured = obj.isPunctured();
		/*System.out.println(false);*/   System.out.println(punctured);
		
		int subTwonumbers = obj.subTwonumbers(10, 4);
		System.out.println(subTwonumbers);
		
		int mulTwonumbers = obj.mulTwonumbers(2, 5, 6);
		System.out.println(mulTwonumbers);
		
		int divTwonumbers = obj.divTwonumbers(10, 5);
		System.out.println(divTwonumbers);
		
	}
	public int getCarregistrationnum() {
		//int Carregistrationnum= 2345;
		return /*Carregistrationnum*/ 2345;
	}

	private String getOwnername() {
		//String Ownername="Rajesh";
		return "Rajesh";
	}
	
	 void printCarmodel() {
		//String Carmodel="Duster";
		System.out.println("Duster");
	}
	
	public boolean isPunctured() {
		//boolean isPuntured = false;
		return false;
	}
	
	public int subTwonumbers( int num1, int num2) {
		return (num1-num2);
	}
	
	public int mulTwonumbers(int num1,int num2, int num3) {
		return num1*num2*num3;
	}
	
	public int divTwonumbers(int num1,int num2) {
			return num1/num2;
	}			
	
/*                public static void main(String[] args) {
	              System.out.println(2345);
	              System.out.println("Rajesh");
	              System.out.println("Duster");
	              System.out.println(false);
	              System.out.println(5-3);
	              System.out.println(5*3);
	              System.out.println(6/3);
	            	}		*/
	
// void is an returntype which does not return any output
			
							/*  int a =10; int	b=5;		//input
	
							public void testDemo()		 			
								{
									int	c=a+b;
												}
								public static void main(String[] args) {
		
											Voidreturntype obj = new Voidreturntype();
												obj.testDemo();
										} */
	
// gives an output without an void.	
	
			/* int a =10; int	b=5;		//input
	
			public int testDemo()					
			{
			int	c=a+b;
			return c;
			}
	
			public static void main(String[] args) {
		
				Voidreturntype obj = new Voidreturntype();
					System.out.println(obj.testDemo());

	}
	    */
	
}