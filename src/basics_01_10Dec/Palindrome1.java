package src.basics_01_10Dec;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = sc.next();

        boolean result = isPalindrome(user_input);
        if(result){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }


    }

    private static boolean isPalindrome(String userInput) {

        String original_str = userInput;
        String y = "";
        for(int i = original_str.length()-1; i >= 0; i--){
            y = y + original_str.charAt(i);
        }
        System.out.println(y);
        return original_str.equalsIgnoreCase(y);

    }
}
