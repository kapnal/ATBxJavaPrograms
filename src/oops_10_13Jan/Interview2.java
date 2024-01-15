package src.oops_10_13Jan;

public class Interview2 {
    public static void main(String[] args) {

        Person02 h1=new Person02();
        Person02 h2=new Person02();
        Person02 h3=null;    //2 objects are created for this line no object created

        //h3.run();  //NullPointerException
        h2.run();    // It can access
    }
}

class Person02 {
    int a;
    void run(){
        System.out.println("Run called");
    }
}
