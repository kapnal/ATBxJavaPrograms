package src.oops_07_30Dec;

public class function {

    public static void main(String[] args) {

        int b =10;

        System.out.println(--b + b++ + b--);
        System.out.println(b);
        //9 + 9+10
        //9 10 9

      int z = sum(3,4);
      int z1 = sum(5);
      int z2 = sum();

        System.out.println(z);
        System.out.println(z1);
        System.out.println(z2);

        sayHello();

    }

      static int sum (int x, int y){
        return x+y;
      }

    static int sum (int x){
        return x;
    }

    static int sum ( ){
        return 99;
    }

    static void sayHello(){
        for(int i = 0; i < 4; i++){
            System.out.println("Hello Kapil");
        }
    }
}
