package src.oops_10_13Jan.encapsulation;

public class Lab148 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name="Amit";
        s1.name="Pramod";
        System.out.println(s1.name);

        PersonS personS = new PersonS();
        personS.id = 1;
        personS.id = 99;
        personS.id = -1;
        personS.bal = 999;
        System.out.println(personS.id);
        System.out.println(personS.bal);

    }

}
