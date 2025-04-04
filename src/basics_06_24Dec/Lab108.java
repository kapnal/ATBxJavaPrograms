package src.basics_06_24Dec;

public class Lab108 {
    public static void main(String[] args) {

        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4.
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        // Coding ->
        // 1. user input - ?
        // 2. Rough logic ->( (year%4 == 0) -> leap and  (year%100 !=0) -> leap )  or   year % 400 == 0))
        // 3. Brute force
        // 4. Logic correction
//        Ex.1700 -Not Leap year
//        1700/4=425  It should be divisible by 4
//        1700/400=4.25  It is not divisible by 400 not leap year
//        If it is divisible by 100 ,it must also be divisible by 400
//        Ex.2024 - Leap year
//        2024/4=506 leap year

        int year = 2000;
        // (year%4 ==0)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }


    }
}
