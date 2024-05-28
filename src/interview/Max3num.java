package src.interview;

public class Max3num {

    public static void main(String[] args) {

        int a = 103;
        int b = 195;
        int c = 280;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Maximum of 3 Numbers is " +max);


    }
}
