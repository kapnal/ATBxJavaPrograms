package src.basics_03_16Dec;

public class Lab029 {
    public static void main(String[] args) {
        String s1 = "Kapil";
        //String Constant pool - SCP / String pool

        //new operator - object
        String s2 = new String("Kapil");
        //new operator is used to create the new object for class
        // It returns of the address of the newly created object
        System.out.println(s2);
        System.out.println(new String("Kapil"));

    }
}
