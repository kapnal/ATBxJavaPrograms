package src.practiceBasics;

import java.util.Scanner;

public class Basics09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        double x = sc.nextDouble();
        System.out.println("Enter the value of Y");
        double y = sc.nextDouble();
        System.out.println("Enter the value of Z");
        double z = sc.nextDouble();

        double result =0;
        //1/3 X^2 + Y^2 - |Z|
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2)- Math.abs(z));

        System.out.println(result);

        sc.close();
    }
}
