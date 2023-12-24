package src.basics_03_16Dec;

public class Lab041 {
    public static void main(String[] args) {

        //Increment Operator
       int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //Part - A (Exp =11, a=11) - ++a -o/p -11
        //Part - B (Exp =11, a=12) - a++ -o/p -11
        //Part - C (Exp =12, a=13) - ++a -o/p -12
        //A+B+C - 11+11+12=34



    }
}
