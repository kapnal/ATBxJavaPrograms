package src.practice;

import java.util.Scanner;

public class Basics08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number1, Number2, I will tell the maximum number");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int max = (number1 > number2) ? number1 : number2;

        System.out.println(max);

//        if(number1 > number2){
//            System.out.println("Maximum Number is number1");
//        } else{
//            System.out.println("Maximum Number is number2");
//        }

        sc.close();

    }
}
