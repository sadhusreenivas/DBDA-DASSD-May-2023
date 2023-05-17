package collections;
import java.util.*;
public class SetDemo {
  public static void main(String[] args) { 
    
    Set<String> h = new TreeSet(new MyComp());
    h.add("Mech");
    h.add("Civil");
    h.add("Electrical");
    h.add("Ece");
    h.add("Cse");
    h.add("Instrumentation");
    h.add("Cse"); // dup
    
   System.out.println(h);
   Iterator itr = h.iterator();
   while(itr.hasNext()){
       System.out.println(itr.next());
   }
}
}

class MyComp implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1); // DESC
    }
}

