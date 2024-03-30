package src.practiceFunction;

public class Basics01 {

    public static void main(String[] args) {

        int output1 = kapil_sum();
        int output2 = kapil_sum(10);
        int output3 = kapil_sum(10,5);

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);

        sayHello();   //Call to the function


    }

    static  int kapil_sum(int input1,int input2){
        return input1 + input2;
    }
    static  int kapil_sum(int input1){
        return input1;
    }
    static  int kapil_sum(){
        return 99;
    }

    static void  sayHello(){

        System.out.println("Say Yes");
    }

    }
