package cdac;
import exceptions.*; //
class VotingApp{
public void vote(int age) throws InvalidAgeException {
 if(age<18)
 	throw new InvalidAgeException("under age");
 else
 	System.out.println("Welcome to Vote!!!");
}	

public static void main(String[] args) {
	VotingApp v1 = new VotingApp();
	VotingApp v2 = new VotingApp();
    try{
	v1.vote(21); //
    v2.vote(17);
    }catch(Exception e){
   	System.out.println(e);
   }
   finally{
   	System.out.println("All resources opened ...were closed");
   }
   System.out.println("Rest of code.........");
}

}