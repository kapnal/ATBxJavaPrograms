package src.interview;

public class StringReverse {

    public static void main(String[] args) {

        String original = "Kapil";
        String reverse = "";

        for (int i = original.length()-1; i >= 0; i--){

            reverse = reverse + original.charAt(i);
        }

        System.out.println(reverse);

        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        System.out.println(sb);


    }
}
