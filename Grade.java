import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ur Name");
		String name = in.next();
		System.out.println("Enter marks in 3 subjects");

		int m1 = in.nextInt();
		int m2 = in.nextInt();
		int m3 = in.nextInt();

		if((m1>100 || m1<0) || (m2>100 || m2<0) || (m3>100 || m3<0)){
			System.out.println("Invalid marks!");
			return;
		}
        
        if (m1<40 || m2<40|| m3<40){
        	System.out.println("FAIL");
        	return;
        }

        int sum = m1+m2+m3;
        int avg = sum/3;
        System.out.println(avg);

        switch(avg/10){
        case 10:
        case 9:
        case 8:
        case 7: System.out.println("Distinctin");
                break;
        case 6: System.out.println("First");
                break;
        case 5: System.out.println("Second");
                break;
        case 4: System.out.println("Third");
                break;
        case 3:
        case 2:
        case 1:
        case 0: System.out.println("FAIL");
                break;                

        }

      
	}

}