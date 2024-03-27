package src.practiceArrays;

public class Basics01 {

    public static void main(String[] args) {

        int [] marks_10 = {96,90,87,56};
        System.out.println(marks_10.length);
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
        System.out.println(marks_10[2]);
        System.out.println(marks_10[3]);
        //System.out.println(marks_10[4]);     // ArrayIndexOutOfBoundsException
        //Index starts from 0
        //Length starts from 1
        //Index = length -1

        //Another way to declare array
        int [] a = new int[4];
        //a --> [0,0,0,0]  - default value of int -> 0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        a[0] =75;
        System.out.println(a[0]);

       final int [] b = new int[4];     //Here final is only for length -4 but we can change the values
        //b --> [0,0,0,0]  - default value of int -> 0
        b[0] = 78;
        System.out.println(b[0]);

    }
}
