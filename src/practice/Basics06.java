package src.practice;

import java.util.Scanner;

public class Basics06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number , I will tell Even or Odd");
        int number = sc.nextInt();

        if(number % 2 ==0){
            System.out.println("Entered Number is Even");
        } else {
            System.out.println("Entered Number is Odd");
        }

        sc.close();

    }
}
