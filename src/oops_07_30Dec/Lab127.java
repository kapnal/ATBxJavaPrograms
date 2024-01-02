package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab127 {
    public static void main(String[] args) {

        //Prime Number condition - The no. which can be divisible by 1 and by itself only
        //Ex. 2 is prime , 3 is prime , 4 is not it is divisible by 2

        int i = 0;
        int flag = 0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number");
        int n = sc.nextInt();

        m = n/2;
        if(n == 0 || n == 1){
            System.out.println("Not a prime -> " + n);
        }else{
            for(i = 2; i <= m; i++){
               if(n%i==0){
                   System.out.println("Not a prime number");
                   flag =1;
                   break;
               }
            }

        }

       if(flag ==0){
           System.out.println("Prime number " + n);
       }


    }
}
