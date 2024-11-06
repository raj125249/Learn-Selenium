package week3day2;

public class IDFC implements RBI{
	
	@Override
	public void withdrawlimit() {
		System.out.println("100000");	
	}
	
	public void kyc() {
		System.out.println("Rajesh");	
	}

	public void interest() {
		System.out.println(3);
	}
	
	public void reporate() {
		System.out.println("rja");
	}
	// added in class
	public void phonenumber() {
		System.out.println(65786);	
	}

	@Override
	public void customer() {
		// TODO Auto-generated method stub
		
	}
	
/*	public static void main(String[] args) {
				IDFC idfc= new IDFC();
				idfc.kyc();
				idfc.phonenumber();
				idfc.withdrawlimit();
				idfc.reporate();
		}			*/
}