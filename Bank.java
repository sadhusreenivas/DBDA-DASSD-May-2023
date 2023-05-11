class Bank extends RBI{
	int cashback;
	public Bank(double intRate, int cashback){
		super(intRate);
		this.cashback = cashback;
	}
    
	 void withdraw(){
      System.out.println("withdraw success");
      System.out.println("you got cashback: "+cashback);
	 }
	 void deposit(){
     System.out.println("deposit success");
     System.out.println("You got interest of "+intRate);
	 }
      @Override
	  void disp(){
    	System.out.println("Im Bank");
    }


}