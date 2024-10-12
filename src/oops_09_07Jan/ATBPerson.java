package src.oops_09_07Jan;

public class ATBPerson {
    String name; // instance  variable values are default
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    //Default Constructor

    ATBPerson(){
        courseName = "ATB";
        System.out.println("I am Default");
    }
    // Param Constructor
    ATBPerson(String Name){
        this.name = Name;
    }

    void talk (){
        System.out.println("Talk");
    }
    void printDetails(){
        System.out.println(this.name);
        System.out.println(courseName);
        System.out.println(this.phone);
        System.out.println(this.email);
        System.out.println(this.isMarried);
    }




}
