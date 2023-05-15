import java.io.*;
public class RWDemo{
	
	public static void main(String[] args) throws IOException {
		
		//FileReader fr = new FileReader("RWDemo.java");
		//BufferedReader br = new BufferedReader(fr);

	    BufferedReader br = new BufferedReader(new FileReader("RWDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("RWDemo.txt"));

		int c;

		while((c=br.read()) != -1){
			bw.write(c); // writing into .txt
            System.out.print( (char) c);
		}

        bw.write("\n\n***********************");
		bw.write("\n Name: ABC");
		bw.write("\n Roll No: 12345");

		br.close();
		bw.close();
	}
}