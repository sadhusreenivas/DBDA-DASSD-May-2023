
package multithreading;

public class First extends Thread{
     Table t;

    public First(Table t) {
        this.t = t;
    }
     
    public void run(){
        t.printTable(19);
    }
    
}
