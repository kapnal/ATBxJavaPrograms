package src.oops_10_13Jan.polymorphism.methodoverriding;

public class RC {
    public static void main(String[] args) {

        Dog d = new Dog(); //It call whoever the object is created in this case Dog is printed
        d.bark();

        Hound h = new Hound(); //It call whoever the object is created in this case Hound is printed
        h.bark();

        Dog f = new Hound(); //It call whoever the object is created in this case Dog is printed
        f.bark();     // Dynamic Diaptch or // Runtime Polymorphism

        //Hound a = new Dog(); // Java 22 This is not possible
        // Latest java 22 - It is never possible in JAVA




    }
}
