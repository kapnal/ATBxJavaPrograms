package src.practiceString;

public class Lab003 {
    public static void main(String[] args) {

        String s1 = "Kapil";
        String s2 = new String("Kapil");

        //StringBuilder and StringBuffer are mutable - that can be changed
        StringBuilder sb3 = new StringBuilder("Kapil");
        StringBuffer sbuf4 = new StringBuffer("Kapil");

        sb3.append(" Nalwar");   //New string is created and old is deleted from object area
        System.out.println(sb3);

        StringBuffer sbf5 = new StringBuffer("Hello");
        sbf5.append(" World");
        System.out.println(sbf5);



    }
}
