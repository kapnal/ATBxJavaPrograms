package src.oops_08_06Jan;

public class Lab133 {
    public static void main(String[] args) {
        //4 ways we can create String
        String s1 = "kapil";     // Immutable in nature (that can't changed)
        String s2 = new String("kapil");   // Immutable in nature (that can't changed)
        //StringBuilder sb3 = new StringBuilder("kapil"); // Mutable - that can be changed!!
        //StringBuffer sb4 = new StringBuffer("kapil");   // Mutable - that can be changed!!

        StringBuilder sb3 = new StringBuilder("kapil");  //original string is deleted/changed
        sb3.append(" nalwar");
        System.out.println(sb3);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

    }
}
