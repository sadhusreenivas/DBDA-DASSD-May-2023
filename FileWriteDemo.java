import java.io.*;
public class FileWriteDemo{
	
	public static void main(String[] args) throws IOException{
		
		//File f = new File("abc.txt");

        FileWriter fw = new FileWriter("abc.txt",true); // append

        fw.write("\nJava is my favourite language!");

        fw.close();

        System.out.println("file written successfully...!");

	}
}