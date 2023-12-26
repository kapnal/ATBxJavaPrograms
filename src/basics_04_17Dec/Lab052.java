package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        //Grade calculator
        //Write a program that calculates and displays letter grade for a given
        //numerical score (e.g. A, B, C , D or F) based on the following
        // grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //E: 0-59
        //1.Input from user
        //Score (Data type) - int - Grade (Char or String)
        //2.Basic login or brute force logic write basic rough code
        //If score >=90 && score <=100 - print A
        //If score >=80 && score <=89 - print A
        //3.write the real code
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();

        if(score >= 90 && score <=100){
            System.out.println("Your score A");
        } else if (score >= 80 && score <=89){
            System.out.println("Your score B");
        } else if (score >= 70 && score <=79){
            System.out.println("Your score C");
        }else if (score >= 60 && score <=69){
            System.out.println("Your score D");
        } else{
            System.out.println("Your score F");
        }

        //4.Debug the code
        //We are debug and checking the code
        //other than int code fails we will fix
        //Exceptions - in future
        //5.Fix the code and final it

    }
}
