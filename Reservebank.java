package week3day2;

 public class Reservebank extends Axisbank {

	@Override
	public void withdrawlimit() {
		System.out.println(750000);
	}

	@Override
	public void customer() {
		System.out.println("rajesh");
	}

	@Override
	public void cibilscore() {
		System.out.println(97);
	}

	public void phonenumber() {
		System.out.println(1234234);
	}
	
public static void main(String[] args) {
	
	Reservebank rb = new Reservebank();
	
		rb.withdrawlimit();
		rb.customer();
		rb.cibilscore();
		rb.phonenumber();
		rb.kyc();
	}
}
