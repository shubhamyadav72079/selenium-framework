package javaPackage;

public class exceptionHandling1 {
    public static void main(String[] args) {
        int i = 4;
        int[] a = {1, 2, 3, 4, 5};
//        try {
//            System.out.println(a[5]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        System.out.println(0/i);
//
//        System.out.println(i/4);
//        try {
//            System.out.println(i / 0);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//
//        };
        System.out.println("shubham");
        try {
            System.out.println(a[5]);

            System.out.println(i / 0);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(e);

        }
        System.out.println("yadav");



    }
}
