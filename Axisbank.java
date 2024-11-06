package week3day2;

// an anstract class wont force to implement interface in it
public abstract class Axisbank implements RBI{					
	
	/* abstract class is partially implemented
	  interface is 100% abstract     */
	
	
	public void kyc() {
		System.out.println("Chennai");
	}
	
// in abstract class if a mthod is created then it should be defined as keyword 'abstract'		
	public abstract void cibilscore();    		// want in this class not to use
	
	
	

	// we can create main method in 
	public static void main(String[] args) {	
	
// can't create obj for abstract class due to it has implemented and unimplemented methods
		//Axisbank axis = new Axisbank();						
	}
	
}
 