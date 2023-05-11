public class X implements Java9Interface{
 
 public void msg(){
 	System.out.println("Implemented.....");
 }
	
 public static void main(String[] args) {
 	
 	X x1 = new X();
 	x1.msg();
 	x1.fun(); // default
 	Java9Interface.stcMethod(); //static

 }
}