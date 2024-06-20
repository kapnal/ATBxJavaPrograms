package src.oops_09_07Jan.inheritance.multilevel;

public class Lab146 {
    public static void main(String[] args) {

//        GrandFather g = new GrandFather();
//        g.bhk3();
//        Father f = new Father();

//        Son s = new Son();

//        GrandFather g = new Son();
//        Father f = new Son();
//       // Son s = new GrandFather(); //Not possible
//        // Son s = new Father(); //Not possible

        GrandFather g = new Son();
        g.bhk3();


        Son s = new Son();   //Son s can access all the object Father & GrandFather
        s.bhk1();
        s.bhk2();
        s.bhk3();

    }
}
