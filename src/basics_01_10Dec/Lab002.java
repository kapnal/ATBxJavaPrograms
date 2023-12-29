package src.basics_01_10Dec;

public class Lab002 {
    public static void main(String[] args) {
      //Keywords simple English words -
        //package, public, class - Reserved words (Java)
        // Keywords are in lowercase
        //We can't use keywords as variables

        byte age=10;  //Range -128 to 127
        //age=128; //Out of range
        age=127;
        //age=127+1  Out of range
        System.out.println(age);
        System.out.println(age+1);

        //Local variables
        short age2=128;   //Range - -32768 to 32768
        short $=129;
        //short _=130;
        //System.out.println(_);   //After java 9 we can not use


    }
}
