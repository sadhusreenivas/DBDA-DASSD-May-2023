package multithreading;
public class BankCustomer {
 double balance;

    public BankCustomer(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public synchronized void withdraw(double amt) {
        if(amt>=balance){
            System.out.println("Less Balance: can't withdraw");
            System.out.println("Waiting for deposit!");
            try{
            wait();  // blocked  for ITC
            }catch(Exception e){}
            balance -= amt;
            System.out.println(getBalance());
            System.out.println("Withdraw success");
        }
        else{
            balance -= amt;
            System.out.println(getBalance());
            System.out.println("Withdraw success");
        }   
    }
    
    public synchronized void deposit(int amt){
        System.out.println("Going to deposit....");
        balance += amt;
        System.out.println(getBalance());
        System.out.println("Deposit success");
        notify(); // ITC
    }
    
    public static void main(String[] args)  {
        BankCustomer b1 = new BankCustomer(25000);
        
        new Thread(){
            public void run(){
                b1.withdraw(30000);
            }
        }.start();
        
        new Thread(){
            public void run(){
                b1.deposit(15000);
            }
        }.start();
    }
}
