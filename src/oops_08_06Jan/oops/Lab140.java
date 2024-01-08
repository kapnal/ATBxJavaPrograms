package src.oops_08_06Jan.oops;

public class Lab140 {
    public static void main(String[] args) {

        // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
        // OOPs concept

        Person p = new Person();
        p.name = "kapil";
        System.out.println(p.name);

        Person p2 = new Person();
        p2.name = "Pramod";
        System.out.println(p2.name);


        new Person(); // object -> new Object empty
        // Person(); -> Method or Function
        Person p3 = null;
        System.out.println("End of the Program");


        // p,p2 and p3 - Ref -
        // p -> kapil , p2 -> Pramod, p3 -> null
    }

}
