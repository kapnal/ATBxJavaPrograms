package src.interview;
import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args){

        String str = "The rains have started here";
        String str1 = "The Rains have started here";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf('s',str.indexOf('s')+1));
        System.out.println(str.indexOf("have"));
        System.out.println(str.indexOf("hello"));  // when string is not present output -1

        // String comparision
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        // substring
        System.out.println(str.substring(0,9));  // it exclude 9th

        // trim
        String s = "  Hello world";
        System.out.println(s.trim());  // remove spaces at start and end
        System.out.println(s.replace(" ",""));

        String date = "01-01-2017";
        System.out.println(date.replace("-","/"));

        // split
        String test = "Hello_World_Test_Selenium";
        String testval[] = test.split("_");
        for (int i = 0; i < testval.length; i++){
            System.out.println(testval[i]);
        }

        String s2 = "care";
        System.out.println(s2.concat("s"));


    }
}
