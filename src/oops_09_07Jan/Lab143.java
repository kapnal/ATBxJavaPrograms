package src.oops_09_07Jan;

import java.util.Scanner;

public class Lab143 {
    public static void main(String[] args) {

        Person p = new Person();
        p.printDetails();
       // new Person(); //Object created default constructor is  called
        //Person p;    //No object created so default constructor is not called

        Person p2 = new Person("Kapil");
        p2.printDetails();

        Person p3 = new Person("Pramod");
        p3.printDetails();

        // this ->

        // p3 -> name -> Pramod -> this -> p3
        // p2 -> name -> Kapil -> this -> p2
        // p ->  name -> null -> this -> nothing



    }
}
