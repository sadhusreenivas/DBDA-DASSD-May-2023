import java.util.*;
public class ExceptDemo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pls Enter two numbers:");
		int a=0;
		int b=0;
		try{
		a = scanner.nextInt();
		b = scanner.nextInt();
		double res2 = a/b; // b=0, throw new ArithmeticException();
		System.out.println(res2);
		int[] arr=null;
		System.out.println(arr.length); //NPE
        }
        catch(ArithmeticException e){
        	System.err.println(e); // handling
        }
        catch(InputMismatchException e){
        	System.err.println(e); // handling
        }
        catch(Exception e){
        	System.out.println(e);
        }
        finally{
        	System.out.println("finally always executed!");
        }

		double res3 = Math.sqrt(a);
		System.out.println(res3);

		double res1 = Math.pow(a,b);
		System.out.println(res1);

		System.out.println("Rest of the code...........");
	}
}