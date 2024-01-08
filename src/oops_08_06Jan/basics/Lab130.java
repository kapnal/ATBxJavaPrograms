package src.oops_08_06Jan.basics;

public class Lab130 {
    public static void main(String[] args) {


        String name = "kapil"; //String constant pool
        String name2 = new String("kapil"); //Heap area

        String str1 = "Hello";
       // str1.concat(" world");  //THis is just creating the string unless we assign value
       str1 = str1.concat(" pramod");
        System.out.println(str1);

    }
}
