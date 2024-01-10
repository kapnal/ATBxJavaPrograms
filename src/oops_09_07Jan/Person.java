package src.oops_09_07Jan;

public class Person {

    String name;

    Person(){
        System.out.println("Default Constructor");
    }

    Person(String ref_name){
        this.name=ref_name;
        System.out.println("Parameterised Constructor");
    }

    void printDetails(){
        System.out.println("Your Name is "+ this.name);

    }



}
