package src.basics_01_10Dec;

public class BankCustomer {
    public static void main(String[] args) {

        BankAccount hdfc = new BankAccount();
        hdfc.printDetails();

        System.out.println(" ---------------------------------");

        BankAccount sbi = new BankAccount("SBI","SBI002",500);
        sbi.printDetails();

        System.out.println(" ---------------------------------");

        BankAccount ICICI = new BankAccount("ICICI","ICICI003",245);
        ICICI.printDetails();

        System.out.println(" ---------------------------------");

    }
}
