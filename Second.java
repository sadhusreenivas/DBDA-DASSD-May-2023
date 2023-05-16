package multithreading;

public class Second extends Thread{
     Table t;

    public Second(Table t) {
        this.t = t;
    }
     
    public void run(){
        t.printTable(17);
    }
    
}
