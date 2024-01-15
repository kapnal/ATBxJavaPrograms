package src.oops_10_13Jan;

public class Interview1 {
    public static void main(String[] args) {
        Person h=new Person();
        System.out.println(h.a);     //Default constructor printed
        Person h2=new Person(23);
        System.out.println(h2.a);

        Person h3=new Person(23,true);
        System.out.println(h3.a);
        System.out.println(h3.b);
        System.out.println(h.b);







    }

}

class Person {
    int a;
    boolean b;

    // Default
    Person(){
        this.a = 10;
    }

    // Parameter Constructor
    Person(int b){
        this.a = b; //  h2.a
    }

    Person(int b,boolean a){
        this.a = b;
        this.b = a;
    }
}
