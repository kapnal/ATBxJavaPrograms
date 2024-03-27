package src.practiceBasics;

import java.util.Scanner;

public class Basics18 {
    public static void main(String[] args) {

        //Factorial Program
        //!2 = 2*1 ,!5=5*4*3*2*1=120
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");

        int number = sc.nextInt();
        long fact =1;

        int i=1;
        while (i<=number){
         fact = fact*i;
         i++;

        }
        System.out.println("Fact " + fact);
        sc.close();

    }
}
