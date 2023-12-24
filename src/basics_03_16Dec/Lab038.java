package src.basics_03_16Dec;

public class Lab038 {
    public static void main(String[] args) {
        //Max in two number
        //if a=10, b=20 , if a>b
        int a=40;
        int b=20;
        int c=62;

        //(a>c) ? a:c
        //(b>c) ? b:

        int max = (a>b) ? ((a>c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);
    }
}
