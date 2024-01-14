package src.oops_10_13Jan;

public class Lab147 {
    public static void main(String[] args) {

  //      BlockClass blockclass = new BlockClass();
//        //BlockClass blockclass; // If we don't create object then No IIB will be called & no default constructor will called
        new BlockClass();
        BlockClass b = new BlockClass();  //If we create 2 objects Static block execute 1 time only but other 2 time
//        new BlockClass();  //If we create 2 objects then 2 times it will call
//        //BlockClass b;  //No object created no o/p
//        BlockClass b= null; //No object created no o/p
//        b = new BlockClass();
    }
}
