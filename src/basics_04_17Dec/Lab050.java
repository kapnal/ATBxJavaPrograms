package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        //If else
        // Yes, No
     //   if (true){
    //        System.out.println("true");
    //    }
     //   else{
      //      System.out.println("false");
     //   }
     //   if (true){
       //     System.out.println("only if");
       // }
        //If ,else if , else
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 20){
            System.out.println("number is > 20");
        } else if (number >10){
            System.out.println("number is > 10");
        }else{
            System.out.println("number is < 10");
        }


    }
}
