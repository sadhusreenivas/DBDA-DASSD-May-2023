class Student{
	String sid;
	String name;
	double gpa;
	String course;
	static String org = "C-DAC";
	void setStudent(String s, String n, double g, String c){
		sid = s;
		name = n;
		gpa = g;
		course = c;
	}
	void getStudent(){
		System.out.println(sid+" "+name+" "+gpa+"  "+course+" "+org);
	}
	public static void main(String[] args) {
	Student s1 = new Student();
	s1.getStudent();
    s1.setStudent("5001", "Abhi",8.9,"DBDA");
    s1.getStudent();
    Student s2 = new Student();
    s2.setStudent("9001", "Abhi",8.9,"DASSD");
    s2.getStudent();
}
}