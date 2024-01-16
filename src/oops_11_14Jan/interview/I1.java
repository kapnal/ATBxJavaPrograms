package src.oops_11_14Jan.interview;

public class I1 {
    public static void main(String[] args) {

        System.out.println(H.a);

        Pramod p = new Pramod();
        p.m1();


    }
}

interface H{
    // Only Static variables

    int a =10;       //in interface always static even we don't type static word
    public static final int b = 20;
    public static final int c  =99;
    void m1(); // This is non static
}
class Pramod implements H{

    @Override
    public void m1() {

    }
}
