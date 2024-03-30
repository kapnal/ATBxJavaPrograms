package src.practiceFunction;

import java.util.Scanner;

public class swaptwono {

    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("value of a " + a);
        System.out.println("value of b " + b);


    }
}
