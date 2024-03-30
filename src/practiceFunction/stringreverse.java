package src.practiceFunction;

public class stringreverse {

    public static void main(String[] args) {

        String name = "Kapil";

        String y = "";

        for (int i =name.length()-1; i >=0; i--){
            y = y + name.charAt(i);

        }

        System.out.println(y);

    }
}
