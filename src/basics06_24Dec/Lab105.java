package src.basics06_24Dec;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

        // Take input user Marks of 5 subjects and Print the marks
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the First subject");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the Second subject");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the Third subject");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the Fourth subject");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the Fifth subject");
        marks[4] = sc.nextFloat();

        for (int i=0; i < marks.length; i++){
            if(marks[i] < 35){
                System.out.println("You are fail in this subject " + marks[i]);
            }
            System.out.println(marks[i]);
        }
        sc.close();

    }
}
