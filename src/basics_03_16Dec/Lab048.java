package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
        //Take three input from user and give max out of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
            System.out.println("Max " +a);
        }
        else{
            System.out.println("Max " +b);
        }

    }
}
