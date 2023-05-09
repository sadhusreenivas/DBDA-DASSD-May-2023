class Sample{

	static int a = 100;
    static String name ="C-DAC";
    
	static void disp(){
		System.out.println(a);
	}
    static void disp(String str){
    	System.out.println("Hello "+name);
    	System.out.println(str+name);
    }

	public static void main(String[] args) {
		
		Sample.disp();
		Sample.disp("hi");
	}
}