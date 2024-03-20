package src.practice;

public class Basics01 {

    public static void main(String[] args) {

//       char c = '\u0041';
//        System.out.println(c);

        int a = 103;
        int b = 95;
        int c = 80;
    int max = (a > b) ? ((a > c) ? a : c): ((b > c) ? b : c);
    System.out.println(max);



    }

}
