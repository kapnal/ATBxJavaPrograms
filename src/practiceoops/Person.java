package src.practiceoops;

public class Person {


    //Method Overloading Same Method Name but different Argument
    void speak(String a){
        System.out.println("A is a String " +a);

    }

    void speak(int x){
        System.out.println("x is a int " +x);


    }

    void speak(double y){
        System.out.println("y is a double " +y);

    }
}
