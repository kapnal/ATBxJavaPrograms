package src.practice;

import java.util.Scanner;

public class Basics05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sie1,side2,side3, I will tell about the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("Equilateral Triangle");

        }else if((side1 == side2) || (side2 == side3) || (side1 == side3)){
            System.out.println("Isosceles Triangle");

        } else {
            System.out.println("Scalene Triangle");
        }

        sc.close();

    }
}
