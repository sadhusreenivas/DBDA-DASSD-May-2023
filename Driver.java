
package multithreading;

public class Driver {
    public static void main(String[] args) {
       
        Table table = new Table();
        // AIC
        new Thread(){
            public void run(){
                table.printTable(19);
            }
        }.start();
        
         new Thread(){
            public void run(){
                table.printTable(17);
            }
        }.start();
         
        new Thread(){
            public void run(){
                table.printTable(14);
            }
        }.start();
          
        new Thread(){
            public void run(){
                table.printTable(18);
            }
        }.start();
        
    }
}
