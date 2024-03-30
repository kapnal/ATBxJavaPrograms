package src.practiceFunction;

import java.util.Scanner;

public class swapnowithoutthirdvar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("value of a " + a);
        System.out.println("value of b " + b);

    }

}
