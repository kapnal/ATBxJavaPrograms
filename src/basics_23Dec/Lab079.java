package src.basics_23Dec;

public class Lab079 {
    public static void main(String[] args) {
        System.out.println("Print the value of i, but I want to break when i = 5");
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Value of " + i);
           if(i ==5){
               break;
           }

        }
        System.out.println("End of program");



    }
}
