package src.interview;
import java.util.Scanner;

public class EvenOdd1 {

    public static void main(String[] args){

        //Given Number is Perfect or not or Even or odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        //int num = 29;

        if (num % 2 ==0){

            System.out.println(num + " is a Even Number");
        } else
            System.out.println(num + " is a Odd Number");

        sc.close();

    }
}
