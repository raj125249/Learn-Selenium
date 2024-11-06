package week3day2;

 			//interface validations

  public class MyBank extends IDFC {	//inheritance(extends)

	public static void main(String[] args) {
		
		//here mybank just an execution class of IDFC class.
		
	//	RBI rbi= new RBI(); 	// valdiation: because an interface	
	/*	IDFC idfc = new IDFC();	(obj ispossible via class IDFC)
		
		idfc.withdrawlimit();
		idfc.kyc();
		idfc.interest();
		idfc.reporate();
		idfc.phonenumber();					*/
		
		MyBank mybank =new MyBank();
		
		mybank.withdrawlimit();
		mybank.kyc();
		mybank.interest();
		mybank.reporate();
		mybank.phonenumber();	
	}
}						