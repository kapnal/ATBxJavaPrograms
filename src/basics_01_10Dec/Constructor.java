package src.basics_01_10Dec;

public class Constructor {
    public static void main(String[] args) {

        ATBPerson p = new ATBPerson();
        p.printDetails();

        ATBPerson p1 = new ATBPerson("Kapil");
        p1.printDetails();

        ATBPerson p2 = new ATBPerson(138,"Kapil");
        p2.printDetails();





    }
}
