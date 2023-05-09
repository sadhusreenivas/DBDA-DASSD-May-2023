public class EmpDemo{
	private int eid;
	private String ename;
	private double basic;
	private static String company;
	private String city;
    
    static{
         // initialize the static members 
    	company = "C-DAC";
    	System.out.println("Its static block...!");
    }

	public Emp(int eid, String ename,double basic){
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
	}
    
    public static void change(){
    	company ="C-DAC Hyd";
    }
	public Emp(int eid, String ename,double basic, String city){
		this(eid,ename,basic); //
		this.city = city;
	}
    // redefining toString()
    public String toString(){
    	return "Employee: ["+ eid+" "+ename+" "+basic+" "+city+" "+company+"]";
    }
	
    public void calSalary(){
    	int hra = 30;
    	int da = 42;
    	int ta = 8;
    	double salary = basic + basic*(da+ta+hra)/100;
    	System.out.println("Total monthly Salary: "+salary);
    }
}