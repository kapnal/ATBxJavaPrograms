package src.basics_03_16Dec;

public class Lab023 {
    public static void main(String[] args) {
        // || - OR
        // T || T - T
        // T || F - T
        // F || T - T
        // F || F - F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println( 10 > 20 || 30 < 50);

        // && - AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println( 10 < 20 && 30 > 50);

        System.out.println();


    }
}
