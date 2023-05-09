import java.util.Scanner;
class StudentDemo{ // fully encapsulated 
	private int sid;
	private String name;
	private double gpa;
	private String course;
	private static String org = "C-DAC";
   // default cons
   public Student(){
   Scanner in = new Scanner(System.in);
   System.out.println("Enter student details");
   sid = in.nextInt();
   gpa = in.nextDouble();
   name = in.next();
   course = in.next();
   }
   // cons - parameterized
   public Student(int s, String n, double g, String c){
		sid = s;
		name = n;
		gpa = g;
		course = c;
	}
	void getStudent(){
		System.out.println(sid+" "+name+" "+gpa+"  "+course+" "+org);
	}

   public static void main(String[] args) {
    Student s1 = new Student(123,"ABC",9.1,"DASSD"); //
	s1.getStudent();
	Student s2 = new Student(); //
	s2.getStudent(); // 0 null 0.0 null C-DAC
   }
	
}