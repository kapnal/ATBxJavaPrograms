package src.interview;

public class Test3 {

    public static void main(String[] args) {

        String str = "Kapil";
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

    }
}
