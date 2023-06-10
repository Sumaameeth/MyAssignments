package Bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Axis Bank deposit account");
	}

	public static void main(String[] args) {
		
		AxisBank bank=new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
		

	}

}
