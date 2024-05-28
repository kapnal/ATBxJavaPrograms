package src.interview;

import java.util.Scanner;

public class Factorialmultiply {
    public static void main(String[] args) {

        //Factorial Program
        //!2 = 2*1 ,!5=5*4*3*2*1=120
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        long fact =1;

        for (int i =1; i <=num; i++) {

            fact = fact*i;

        }
        System.out.println("Fact " + fact);
        sc.close();

    }
}
