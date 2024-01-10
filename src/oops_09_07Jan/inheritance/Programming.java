package src.oops_09_07Jan.inheritance;

public class Programming {

    int version;
    String author;

    Programming(){
        System.out.println("Program DC");
    }

    Programming(String author,int version){
        this.author = author;
        this.version = version;

    }

    void printInfo(){
        System.out.println("Program Info " + this.version + " Author " + this.author );
    }

    void car(){
        System.out.println("Lamb");
    }

    void bhk3(){
        System.out.println("3BHK");
    }

}
