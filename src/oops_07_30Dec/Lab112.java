package src.oops_07_30Dec;

public class Lab112 {
    public static void main(String[] args) {
        int c = kapil_sum(); // No arguments
        int c1 = kapil_sum(2); // 1 arguments
        int c2 = kapil_sum(2,9); // 1 arguments
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        sayHello(); // Call to the function
    }
    static int kapil_sum(){
        return 99;
    }
    static int kapil_sum(int input_1){
        return input_1;
    }
    static int kapil_sum(int input_1, int input_2){ // Definition of the Function
        return input_1+input_2;
    }
    static void sayHello(){
        System.out.println("Say Yes");
    }
}
