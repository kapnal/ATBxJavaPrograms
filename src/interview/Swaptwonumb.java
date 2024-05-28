package src.interview;

import java.util.Scanner;

public class Swaptwonumb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

//        int temp = a;      //Using temp variable
//        a = b;
//        b = temp;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);


    }
}
