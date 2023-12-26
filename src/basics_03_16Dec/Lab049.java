package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {
        //Take three input from user and give max out of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b){
            System.out.println("Min" +a);
        }
        else{
            System.out.println("Min" +b);
        }

    }
}
