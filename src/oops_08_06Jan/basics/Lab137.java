package src.oops_08_06Jan.basics;

import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = scanner.next();
//        user_input = user_input.toLowerCase();
        boolean result = isPalindrome(user_input);
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String userInput) {
        String original_str = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_string = sb.reverse().toString(); // domarP , naman
        return original_str.equalsIgnoreCase(reverse_string);

    }


}
