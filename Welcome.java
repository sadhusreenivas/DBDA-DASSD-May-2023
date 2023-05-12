package in.cdac;
import cdac.DBDA; // explicit
import cdac.hyd.*; // implicit

public class Welcome{
	
	public static void main(String[] args) {

		DBDA d1 = new DBDA(32);
		d1.getDBDA();

		DASSD d2 = new DASSD(14);
		d2.getDASSD();
		
	}

}