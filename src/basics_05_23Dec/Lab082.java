package src.basics_05_23Dec;

public class Lab082 {
    public static void main(String[] args) {

        //Print the odd number in between 1 to 50
        // If else
//        for (int i=1;i<=50;i++){
//            if (i%2 ==1) {
//                System.out.println(i + " is odd");
//            }
//        }
//        for (int i=50;i>0;i--){
//            if (i%2 ==1) {
//                System.out.println(i + " is odd");
//            }
//        }

        //For Even value we can use if(!(i%2==1)) OR if(i==0)
//        for (int i=1;i<=50;i++){
//            if (i%2 ==0) {
//                System.out.println(i + " is even");
//            }
//        }
        for (int i=1;i<=50;i++){
            if (!(i%2 ==1)) {
                System.out.println(i + " is even");
            }
            else {
                System.out.println(i + " is odd");
            }
        }

        System.out.println("End of program");



    }
}
