package src.basics_05_23Dec;

public class Lab078 {
    public static void main(String[] args) {
        System.out.println("Print the value of i, but I want to break when i = 5");
        for (int i = 1; i <=10 ; i++) {
           if(i ==5){
               break;
           }
            System.out.println("Value of " + i);
        }
        System.out.println("End of program");



    }
}
