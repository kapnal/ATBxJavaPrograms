package src.oops_07_30Dec;

public class Function1 {

    public static void main(String[] args) {

              int c = sum_kap(5,13);
              int c1 = sum_kap(12);
              int c2 = sum_kap();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        int d = sum_kap(3,5);
        System.out.println(d);



    }

    static int sum_kap (int a, int b) {
        return a+b;
    }

    static int sum_kap (int a) {
        return a;
    }

    static int sum_kap ( ) {
        return 10;
    }
}
