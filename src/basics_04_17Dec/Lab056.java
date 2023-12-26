package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {
        //If, switch - condition Based
        //Loops - which will repeat something - for, while, do while
        //switch - condition based - Multiple condition
        //If else , else if
        // which day is today!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7, I will tell you day it is");
        // 1 - Monday ,7 - Sunday , MTWTFSS , invalid - 99 -
         int dayNumber = sc.nextInt();

         switch (dayNumber) {
             case 1:
                 System.out.println("Mon");
                 break;
             case 2:
                 System.out.println("Tue");
                 break;
             case 3:
                 System.out.println("Wed");
                 break;
             case 4:
                 System.out.println("Thu");
                 break;
             case 5:
                 System.out.println("Fri");
                 break;
             case 6:
                 System.out.println("Sat");break;

             case 7:
                 System.out.println("Sun");
                 break;
             default:
                 System.out.println("ARE YOU MAD");
                 break; //This break is optional if default is last option
         }
        System.out.println("End of ");
    }
}
