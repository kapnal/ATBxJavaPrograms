package src.interview;
import java.util.Scanner;

public class EvenOdd2 {

    public static void main(String[] args){

        //Print Even and odd Number from 1 to 10

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is a Even Number");
                continue;
            }
            System.out.println(i + " is a odd Number");

        }

    }
}
