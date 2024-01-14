package src.oops_10_13Jan;

public class BlockClass {

    { // Instance Initialization Block
        System.out.println("I am IIB");
    }

    BlockClass(){                       //Default constructor
        System.out.println("I am DC");
    }

    static { // SIB Static Initialization Block
        System.out.println("I am SIB");
    }


}
