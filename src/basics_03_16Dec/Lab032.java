package src.basics_03_16Dec;

public class Lab032 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; //SCP -String constant pool or OA -Object Area or HEAP Area
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 = new String ("The Testing Academy"); //OA - HEAP Area
    }
}
