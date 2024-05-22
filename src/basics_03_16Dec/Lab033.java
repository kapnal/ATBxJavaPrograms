package src.basics_03_16Dec;

public class Lab033 {
    public static void main(String[] args) {
        String name = "The Testing Academy";   //SCP
        String name1 = "The Testing Academy";  //SCP
        String name2 = new String ("The Testing Academy"); //HEAP Area

        System.out.println(name ==name1);
        System.out.println(name.equals(name1));
        System.out.println(name ==name2); //name is in -SCP and name2 is in OA
        System.out.println(name.equals(name2));

    }
}
