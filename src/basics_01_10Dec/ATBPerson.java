package src.basics_01_10Dec;

public class ATBPerson {

    String name;
    int id;
    long phone;
    String email;
    boolean isMarried;

    //Default Constructor
    ATBPerson(){
        System.out.println("I am the default constructor");
    }

    ATBPerson (String objectref) {
        this.name = objectref;
    }
    ATBPerson (int i, String n) {
        this.id =i;
        this.name =n;
    }

    void printDetails(){
        System.out.println(this.id +" " +this.name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(isMarried);
    }






}
