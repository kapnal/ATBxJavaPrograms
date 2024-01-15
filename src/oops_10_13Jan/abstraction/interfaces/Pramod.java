package src.oops_10_13Jan.abstraction.interfaces;

public class Pramod implements FatherI{
    @Override
    public void loan1K() {
        FatherI.print2();
        System.out.println("I will give your loan");
    }
}
