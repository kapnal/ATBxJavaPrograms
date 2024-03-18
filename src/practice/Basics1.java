package src.practice;

public class Basics1 {
    public static void main(String[] args) {

        int a =20;

        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // Exp =21 , a=21  , ++a = 21
        // Exp =21 , a=22  , a++ = 21
        // Exp =22 , a=23  , a++ = 22
        //Exp= 21+21+22 = 64 , a = 23



    }
}
