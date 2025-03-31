package src.interview;

import java.util.Scanner;

public class Factorialsum {
    public static void main(String[] args) {

        int num = 5;
        long fact =0;

        for (int i =1; i <=num; i++) {

            fact = fact+i;

        }
        System.out.println("Fact " + fact);
    }

}
