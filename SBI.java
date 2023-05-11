public class SBI implements ATM{	
	public void withdraw(){
     System.out.println("withdraw success...");
	}
	public void deposit(){
    System.out.println("deposit success...and going to get interest "+intRate);
	}
	public void transfer(){
     System.out.println("Transfer success");
	}
	void disp(){
		System.out.println("Welcome to SBI");
	}
    public static void main(String[] args) {
    	ATM atm = new SBI();
    	atm.withdraw();
    	atm.deposit();
    	atm.transfer();

    	SBI sbi = new SBI();
    	sbi.disp();

    }

}