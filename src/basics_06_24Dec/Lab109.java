package src.basics_06_24Dec;

public class Lab109 {
    public static void main(String[] args) {

        int [] a = {1,2,3};
        try {
            System.out.println(a[10]);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of Program");
        // Name of Exception - > java.lang.ArrayIndexOutOfBoundsException
        // JVM - Giving
    }
}
