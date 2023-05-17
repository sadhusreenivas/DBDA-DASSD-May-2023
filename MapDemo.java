package collections;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> m = new TreeMap(new MyComp());
        m.put(123,"ABC");
        m.put(199,"XYZ");
        m.put(70,"QWERTY");
        m.put(350,"ABC");
        m.put(99,"PQR");
        
        System.out.println(m);
        
        Collection c1 = m.keySet();
        System.out.println(c1);
        
        Collection c2 = m.values();
        System.out.println(c2);
        
        // iterate  - 
        Set s = m.entrySet(); // Map.Entry
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey()+"  "+me.getValue());
        }
        
    }
}

class MyComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
     
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        
        return i2.compareTo(i1);
    } 
    
}