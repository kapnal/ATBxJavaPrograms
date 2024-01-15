package src.oops_10_13Jan.polymorphism.methodoverloading;

public class Person {

    // Method OverLoading -> multiple methods with same name, but different argument.

    void speak(String a){
        System.out.println("A is a String " + a);
    }
    void speak(int x){
        System.out.println("X is a int " + x);
    }

    void speak(double y){
        System.out.println("Y is a double " + y);
    }
}
