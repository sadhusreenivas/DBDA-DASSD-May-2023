package multithreading;
public class Main {
    public static void main(String[] args) {
     
        Display d = new Display();
        
        Thread t1 = new Thread(){
            public void run(){
                d.dispUpper();
            }
        };
        
        Thread t2 = new Thread(){
            public void run(){
                d.dispLower();
            }
        };
        
        Thread t3 = new Thread(){
            public void run(){
                d.dispNumbers();
            }
        };
        
        t1.start();
        
        t2.start();
        t3.start();
    }
        
}
