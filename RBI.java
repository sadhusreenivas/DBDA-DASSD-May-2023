abstract class RBI{
	double intRate;

	public RBI(double intRate){
    this.intRate = intRate;
	}

	abstract void withdraw();
	abstract void deposit();
    void disp(){
    	System.out.println("Im RBI");
    }
}