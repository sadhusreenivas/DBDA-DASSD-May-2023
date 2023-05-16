package multithreading;

public class Multi extends Thread{
     
    public void run(){
       if(Thread.currentThread().getName().equals("even")){
           for(int i=0; i<=10;i=i+2){
               System.out.println("Even: "+i);
           }     
       }
       else if(Thread.currentThread().getName().equals("odd")){
           for(int i=1; i<=10;i=i+2){
               System.out.println("Odd: "+i);
           }
       }
       else{
           for(int i=5; i<=50;i=i+5){
               System.out.println("multiples of 5: "+i);
           }
       }
    }
    public static void main(String[] args) throws Exception {
        
        Multi t1 = new Multi();
        Multi t2 = new Multi();
        Multi t3 = new Multi();
        
        t1.setName("even");
        t2.setName("odd");
        
        t1.start();
        t2.start();   
        t3.start();
      

    }
}
