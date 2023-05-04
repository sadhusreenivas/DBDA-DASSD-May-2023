public class First{
   	public static void main(String[] args) {
	
	java.util.Scanner in = new java.util.Scanner(System.in);
	System.out.println("Enter a Number");
	int n = in.nextInt();
    int a = n;
	int sum = 0;
	while(n>0){

		int d = n%10;
		sum = sum + d*d*d;
		n = n/10;
	}
    if(sum == a)
    	System.out.println(a+" is Armstrong!");
    else
    	System.out.println(a+" is not Armstrong!");
}
}