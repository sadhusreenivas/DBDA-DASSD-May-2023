
package collections;
import java.util.*;
public class ALDemo {
    
    public static void main(String[] args) {
        
         ArrayList al = new ArrayList();
         al.add(10);
         al.add("Java");
         al.add(false);
         al.add(null);
         al.add(10);
         al.add("Python");
         System.out.println(al.size());
         
         System.out.println(al);
         
         for(Object obj :al){
             System.out.println(obj);
         }
         // universal cursor
         Iterator itr = al.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
    }
    }
   
    
    
}
