package javaPackage;

public class exceptionHandling2 {
    public static void main(String[] args) throws Exception{
        Thread.sleep(3000);
        System.out.println("mohityadav");
        /*
        the throws exception only supress exception
        */
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){}
        System.out.println("Shubham yadav");
//        the try catch handled the exception
        
    }
}
