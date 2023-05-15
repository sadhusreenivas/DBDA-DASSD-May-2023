package serialization;
import java.io.*;
public class SerializeTest {
    public static void main(String[] args) throws Exception {
        
        Person p1 = new Person("ABC", 30,"India");
        System.out.println(p1);
        
        // serialization
        FileOutputStream fos = new FileOutputStream("person.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        
        // de- serialization
        FileInputStream fis = new FileInputStream("person.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p2 = (Person) ois.readObject();
        System.out.println("After de-serialization:");
        System.out.println(p2); //
                
    }
}
