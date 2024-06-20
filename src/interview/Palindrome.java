package src.interview;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, I will check for palindrome");
        String user_input = sc.next();

        boolean result = isPalindrome(user_input);
        if(result){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }

    private static boolean isPalindrome(String userInput){
        String original_str = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_string= sb.reverse().toString();
        return original_str.equalsIgnoreCase(reverse_string);
    }
}
