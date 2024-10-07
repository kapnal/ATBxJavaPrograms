package src.basics_04_17Dec;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enter the side1,side2,side3, I will tell you about triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2 ) && (side2 == side3 ) && (side1 == side3)) {
            System.out.println("EQ");
        }

        else if ((side1 == side2 ) || (side2 == side3 ) || (side1 == side3)) {
            System.out.println("ISO");
        }
        else {
            System.out.println("SCA");
        }

        sc.close();


    }
}
