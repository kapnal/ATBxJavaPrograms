package src.practiceArrays;

public class Basics10 {

    public static void main(String[] args) {

        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

//If year is not divisible by 100 and divisible by 4 then it is leap year
        // 2020 -> 2020%4 = 505  but 2020%100=20.2 not divisible by 100  so it is leap year
        //2000 -> 2000%4=500 2000%100=20 and 2000%400=5   so it is leap year
//
//        If the year is evenly divisible by four, then go to step 2. Otherwise, go to step 5.
//
//        If the year is evenly divisible by a hundred, then go to step 3. Otherwise, go to step 4.
//
//        If the year is evenly divisible by four hundred, then go to step 4. Otherwise, you can go to step 5.
//
//        The year is a leap year (if it has 366 days).
//
//        The year is not a leap year (if it has 365 days)

        int year = 1300;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }


    }
}
