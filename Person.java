interface Person{ 
 void eat();
 void talk();

 public static void main(String[] args) {
	
     Person p = new Person(){
     	public void eat(){
     		System.out.println("fruits....");
     	}

     	public void talk(){
     		System.out.println("Gossips.....");
     	}
     };
     p.eat();
     p.talk();
 	}	
}