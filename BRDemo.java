import java.io.*;
public class BRDemo{
	public static void main(String[] args) throws IOException {
		//FileReader fr = new FileReader("RWDemo.java");
		//BufferedReader br = new BufferedReader(fr);

	    BufferedReader br = new BufferedReader(new FileReader("BRDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("BRDemo.txt"));

		String line = br.readLine(); // first line

		while( line != null){
			bw.write(line); // writing into .txt
            System.out.println(line);
            line = br.readLine();
		}

        bw.write("\n\n***********************");
		bw.write("\n Name: ABC");
		bw.write("\n Roll No: 12345");

		br.close();
		bw.close();
	}
}