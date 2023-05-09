public class Emp{
	private int eid;
	private String ename;
	private double basic;
	private static String company = "C-DAC";
	private String city;

	public Emp(int eid, String ename,double basic){
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
	}
    
    public static void change(){
    	company =" C-DAC Hyd";
    }
	public Emp(int eid, String ename,double basic, String city){
		this(eid,ename,basic); //
		this.city = city;
	}

	public void disp(){
		System.out.println(eid+" "+ename+" "+basic+" "+company+" "+city);	
	}
    public void calSalary(){
    	int hra = 30;
    	int da = 42;
    	int ta = 8;
    	double salary = basic + basic*(da+ta+hra)/100;
    	System.out.println("Total monthly Salary: "+salary);
    }
}