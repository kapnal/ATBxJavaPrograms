package src.basics_03_16Dec;

public class Lab027 {
    public static void main(String[] args) {
        //Casting - mold
        byte b= 10;
       //int a= b; // Implicit Casting - JVM
        int a= (int) b;  // Explicit Casting - JVM

        //
        int a1 = 300;
        //byte b1 = a1; //Invalid - Implicit Casting
        byte b1 = (byte) a1;  // Explicit casting
        System.out.println(b1);
    }
}
