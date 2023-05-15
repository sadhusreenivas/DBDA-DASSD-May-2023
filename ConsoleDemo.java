import java.io.*;

public class ConsoleDemo{
	public static void main(String[] args) {
		
		Console c = System.console(); // 
        System.out.println("Enter name and age");
        String name = c.readLine();
        int age = Integer.parseInt(c.readLine());

        System.out.println(name+"  "+age);

        System.out.println("Enter password....");
        char[] pwd = c.readPassword();

        System.out.println(pwd);

	}
}