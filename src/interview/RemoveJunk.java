package src.interview;

public class RemoveJunk {

    public static void main(String[] args) {

        String s = "$#@* Test 123456";
        String s1 = "%&*#@$! Testing @%!$@ Selenium";

        s = s.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(s);

        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);


    }
}
