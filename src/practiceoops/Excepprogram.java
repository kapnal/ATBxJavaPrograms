package src.practiceoops;

public class Excepprogram {

    public static void main(String[] args) throws Exception  {
        int a = 10/10;
        System.out.println(a);

        {
            int a1 = 10/0;
            throw new ArithmeticException();

        }




    }
}
