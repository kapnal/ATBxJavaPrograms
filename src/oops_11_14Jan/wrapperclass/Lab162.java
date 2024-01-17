package src.oops_11_14Jan.wrapperclass;

public class Lab162 {

    public static void main(String[] args) {

        int x = 123;
        //String st1 = x;        //Not possible
        //String st1 = (String)x; //Not possible
        String st1 = x+"";
        String s1 = String.valueOf(x);
        System.out.println(st1);
        System.out.println(s1);
    }
}
