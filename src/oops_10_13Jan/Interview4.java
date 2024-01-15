package src.oops_10_13Jan;

public class Interview4 {
    public static void main(String[] args) {

        //System.out.println(P04.a); //Can not call class directly
       // System.out.println(P04.run);  //Not possiblr
        System.out.println(P04.b);  //static is possible directly with class name
        //System.out.println(P04.run2());
        P04.run2();



    }
}

class P04 {
    int a;

    static int b;

    static void run2(){
        System.out.println("Hahah");
    }
    void run(){

    }
}
