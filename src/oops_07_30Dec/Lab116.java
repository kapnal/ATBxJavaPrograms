package src.oops_07_30Dec;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        System.out.println(sc.next());

        int c = main (10,20,30);
        System.out.println(c);
        int d = main (25);
        System.out.println(d);
    }
    public static int main(int kapil) {    //Method overloading same main method cn not declared it throws error so we changed name removed String
        return kapil;
    }

    public static int main(int a,int c,int d) {
        return 99;
    }

    public static void main(int a,int b) {
        System.out.println("Another Main");
    }

    }

