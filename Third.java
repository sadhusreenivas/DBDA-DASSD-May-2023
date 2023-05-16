package multithreading;

public class Third extends Thread{
     Table t;

    public Third(Table t) {
        this.t = t;
    }
     
    public void run(){
        t.printTable(14);
    }
    
}
