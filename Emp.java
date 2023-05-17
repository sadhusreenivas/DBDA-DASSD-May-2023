package collections;
public class Emp {
    private int empID;
    private String empName;
    private double salary;
    private static String org = "Meta";

    public Emp(int empID, String empName, double salary) {
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmpID() {
        return empID;
    }

    public static String getOrg() {
        return org;
    }

    
    @Override
    public String toString() {
        return "Emp{" + "empID=" + empID + ", empName=" + empName + ", salary=" + salary +", Org="+org + '}';
    }
    
}
