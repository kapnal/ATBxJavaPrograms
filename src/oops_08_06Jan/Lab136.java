package src.oops_08_06Jan;

public class Lab136 {
    public static void main(String[] args) {

        // If something is Thread Safe, we avoid! (StringBuffer we avoid)
        // StringBuffer vs StringBuilder  //StringBuilder we use
        //We use Stringbuilder when we want to run multiple test cases in multiple browser
        StringBuilder stringBuilder = new StringBuilder("kapil");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
