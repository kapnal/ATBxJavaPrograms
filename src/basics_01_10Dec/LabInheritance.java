package src.basics_01_10Dec;

public class LabInheritance {
    public static void main(String[] args) {

       // Programming p = new Programming();  //Only Programming DC called
        Java j = new Java("Pramod");  //Child will call both Java and Programming because Java extends Programming
       // Programming p2 = new Java();
       // Java j2 = new Programming();  //Invalid - Child reference can not have a parent object
        j.printInfo();
        j.bhk3();
        j.author="Kapil";
        System.out.println(j.author);




    }
}
