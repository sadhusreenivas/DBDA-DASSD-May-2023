package collections;
import java.util.*;
public class ALDemo {
    
    public static void main(String[] args) {
        
         ArrayList<Integer> al = new ArrayList();
         al.add(10);
         al.add(20);
         al.add(5);
       //  al.add("Java");
         
         List<Integer> al2 = new ArrayList();
         al2.add(1);
         al2.add(12);
         al2.add(15);
         
         al.addAll(al2); //
         
         System.out.println(al.size());
         System.out.println(al);
         
         al.remove(4); // 10
         System.out.println(al);
      
         Collections.sort(al); //
         System.out.println("After sorting!");
         // universal cursor
         Iterator<Integer> itr = al.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
    }
    }
   
    
    
}
