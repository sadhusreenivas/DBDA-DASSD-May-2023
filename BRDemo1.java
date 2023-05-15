import java.io.*;

public class BRDemo1{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Enter name and age");

        try{
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine()); //

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

       } catch(Exception e){
       	System.out.println(e);
       }

	}
}