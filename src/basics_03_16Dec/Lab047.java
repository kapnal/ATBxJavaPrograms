package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        //Take an input from user in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, I will tell if it is even or odd");
        int a = sc.nextInt();

        if (a%2 ==1){
            System.out.println("ODD number");
        }
        else{
            System.out.println("Even number");
        }
    }
}
