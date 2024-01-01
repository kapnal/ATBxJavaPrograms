package src.oops_07_30Dec;

public class Lab117 {
    public static void main(String[] Kapil) {

        System.out.println("Run fine !!");
        int c = main(10);
        System.out.println(c);
       String d=main("I am printing the value");
        System.out.println(d);

    }

    static  String main (String a){
        return a;
    }
    static int main(int a){
       return a+101;
    }
}
