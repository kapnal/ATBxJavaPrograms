package src.practice;

import java.util.Scanner;

public class Basics03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 20){
            System.out.println("Number is > 20");
        } else if (number > 10) {
            System.out.println("Number is > 10");
        } else {
            System.out.println("Number is < 20");
        }

        sc.close();


    }
}
