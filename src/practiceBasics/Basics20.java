package src.practiceBasics;

public class Basics20 {
    public static void main(String[] args) {

        int a = 60;
        int b = 50;
        int c = 40;

        int max = (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
        System.out.println(max);

    }
}
