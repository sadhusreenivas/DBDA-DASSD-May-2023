public class ArrayDemo{
	public static void main(String[] args) {
		
		String[] cities = {"Hyd", "Blr","Mum","Del","NGP"};
        int[] arr = new int[10];
        int sum = 0;
         // reading to arr
        for(int i=0; i<arr.length;i++){
        	arr[i] = 1 + (int) (Math.random()*100);
            sum += arr[i];
        }
       
        int min = arr[0];
        int max = arr[0];
        
         for(int i=0; i<arr.length;i++){

            if(arr[i] > max)
            	max = arr[i];

            if(arr[i] < min)
            	min = arr[i];
         }

        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

        System.out.println("Sum: "+sum);

 

        // printing cities
        for(String city: cities)
        	System.out.println(city);

        for(int i: arr)
        	System.out.println(i);


        java.util.Scanner in = new java.util.Scanner(System.in);
	    System.out.println("Enter a Number to search");
	    int x = in.nextInt();
        boolean flag = false;
	    for(int i=0; i<arr.length;i++){
        
        if(x == arr[i]){
        System.out.println(x+"  found at "+i+" index");
        flag = true;
        break;
        }

	    } // for end

	    if(flag == false)
	    	System.out.println(x+ " not found");

	    java.util.Arrays.sort(arr);
	    java.util.Arrays.sort(cities);


        // printing cities
        for(String city: cities)
        	System.out.println(city);

        for(int i: arr)
        	System.out.println(i);

	}
}