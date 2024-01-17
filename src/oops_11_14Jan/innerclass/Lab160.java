package src.oops_11_14Jan.innerclass;

public class Lab160 {
    public static void main(String[] args) {

        Parent p = new Parent();
        Child child = new Child();
        p= child;
       // child = p;  //Not possible
        Hello hello = new Child2();
        Hello hello2 = new Hello();
       //Child2 hai = new Hello();  //Not possible

        Child2 hai = (Child2) hello;// Downcasting in class
        Child2 hai2 = (Child2) hello2; //Downcasting in class

    }
}

class Hello{}
class Child2 extends Hello{}


//Upcasting and Downcasting in Class

class Parent{}
class Child extends Parent{}
