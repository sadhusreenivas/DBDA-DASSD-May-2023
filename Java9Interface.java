public interface Java9Interface {
    void msg();

    default void fun(){
        System.out.println("Its a default method");
        pvtMethod();
    }

    private void pvtMethod(){
        System.out.println("Its private method in interface");
    }
    
    static void stcMethod(){
         System.out.println("Its a static method");
         pvtStcMethod();
    }
    
    private static void pvtStcMethod(){
         System.out.println("Its static private method in interface");
    }
}