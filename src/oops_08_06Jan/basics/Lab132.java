package src.oops_08_06Jan.basics;

public class Lab132 {
    public static void main(String[] args) {

        String s1 = "kapil";
        String s2 = new String("kapil");
        String s3 ="kapil";
        System.out.println(s1 == s2);      //Check for References
        System.out.println(s1.equals(s2));  //Checks for Contents are equal
        System.out.println(s1 ==s3);

    }
}
