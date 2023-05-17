package collections;
import java.util.*;
public class TreeSetDemo {
   public static void main(String[] args) {
       
    TreeSet<Emp> ts1 = new TreeSet(new NameComp());
    
    Emp e1 = new Emp(123,"ABC",78000);
    Emp e2 = new Emp(101,"XYZ",88000);
    Emp e3 = new Emp(105,"ASDF",68000);
    Emp e4 = new Emp(199,"PQR",48000);
    Emp e5 = new Emp(153,"QWERTY",98000);
    
    ts1.add(e1);
    ts1.add(e2);
    ts1.add(e3);
    ts1.add(e4);
    ts1.add(e5);
    ts1.add(new Emp(193,"MNR",99000));
    
    
    TreeSet<Emp> ts2 = new TreeSet(new SalaryComp());
    ts2.add(e1);
    ts2.add(e2);
    ts2.add(e3);
    ts2.add(e4);
    ts2.add(e5);
    ts2.add(new Emp(193,"MNR",99000));
    
    // prining name ASC
       System.out.println("prining names ASC");
    Iterator<Emp> itr1 = ts1.iterator();
    while(itr1.hasNext()){
        System.out.println(itr1.next());
    }
      // prining salary DESC
       System.out.println("prining salaries DESC");
    Iterator<Emp> itr2 = ts2.iterator();
    while(itr2.hasNext()){
        System.out.println(itr2.next());
    }
}
}

class NameComp implements Comparator<Emp>{

    @Override
    public int compare(Emp e1, Emp e2) {  
        return e1.getEmpName().compareTo(e2.getEmpName());
    }
}

class SalaryComp implements Comparator<Emp>{

    @Override
    public int compare(Emp e1, Emp e2) {  
      
        if(e2.getSalary()>e1.getSalary())
            return 1;
        else
            return -1; 
     
    }
}