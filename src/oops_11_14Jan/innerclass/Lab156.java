package src.oops_11_14Jan.innerclass;

public class Lab156 {

    public static void main(String[] args) {

        Pramod.Ipad pi = new Pramod.Ipad();
        pi.eating();
    }
}

// Class Members
class Pramod{
    int age  = 31; // Data Memebers / Instances Variables

    // Methods
    void eay(){
        System.out.println("I am eating");
    }

    static class Ipad{
        void eating(){
            System.out.println("I am IPAD");
            //System.out.println(age);
        }
    }



}
