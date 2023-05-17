
package collections;
import java.util.*;
public class LLDemo {
        public static void main(String[] args) {
         
        List<String> ll = new LinkedList();

        ll.add("Jalgoan");
        ll.add("Nagpur");
        ll.add("Shirdi");
        ll.add("Pondicherry");
        ll.add("Goa");
        ll.add("Jodhpur");
        
        System.out.println(ll);
        
        ListIterator<String>  litr = ll.listIterator();
        
        while(litr.hasNext()){
 
            String str = litr.next();
            if(str.equals("Pondicherry"))
                litr.remove();
            if(str.equalsIgnoreCase("GOA"))
                litr.set("Pune");
            
        }
        
            System.out.println(ll);
    }
}
