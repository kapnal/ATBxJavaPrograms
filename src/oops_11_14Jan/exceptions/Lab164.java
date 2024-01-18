package src.oops_11_14Jan.exceptions;

public class Lab164 {
    public static void main(String[] args) {
      try {
          String name = null;
          name.trim();
          System.out.println("I am Kapil");
      }catch (Exception e){
            System.out.println("You are trying to trim a null string that is not possible in java!!");
        }
        System.out.println("Hi I am the End");
    }

}


// Exception -?>
//  event that occurs during the execution of a program
//  that disrupts the normal flow of instructions.
