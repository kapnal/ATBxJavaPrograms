package src.interview;

public class Max2num {

    public static void main(String[] args) {

        int a = 203;
        int b = 195;

        int max = a > b ? a : b ;     //Ternary Operator

        //System.out.println(Math.max(a,b));   //Alternate only for 2 numbers max

        System.out.println("Maximum of 2 Numbers is " +max);

        if (a > b){

            System.out.println("Maximum Number is " +a);
        } else
            System.out.println("Maximum Number is " +b);


    }
}
