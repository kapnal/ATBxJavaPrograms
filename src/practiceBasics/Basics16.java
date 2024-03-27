package src.practiceBasics;

public class Basics16 {

    public static void main(String[] args) {

        for (int i= 0; i <= 10; i++) {

            if(i % 2 == 0){
                System.out.println("val of Even " + i);
                continue;
            }
            System.out.println("val of Odd " +i);

        }

    }
}
