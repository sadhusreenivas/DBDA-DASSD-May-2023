package multithreading;

public class MultiRun implements Runnable {
     public void run(){
     for(int i = 100; i<=110; i = i+2){
         System.out.println("Even:"+i);
         try{
         Thread.sleep(500);
         }catch(Exception e){}
    }
    }
    public static void main(String[] args) {   
      Runnable r1 = new MultiRun(); // runnable 
      Runnable r2 = new MultiRun(); // runnable 
      
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      
      t1.start();
      t2.start();
        
    }
}
