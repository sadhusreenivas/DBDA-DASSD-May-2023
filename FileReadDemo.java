import java.io.*;
public class FileReadDemo{
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("FileReadDemo.java");

		int c;

		while((c=fr.read()) != -1){
            System.out.print( (char) c);
		}
		fr.close();
	}
}