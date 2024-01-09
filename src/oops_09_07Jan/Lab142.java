package src.oops_09_07Jan;

public class Lab142 {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        BankAccount hdfc = new BankAccount("HDFC","hdfc001");
        hdfc.printDetails();

        BankAccount icici = new BankAccount("ICICI","icici001");
        //icici.bankCode="icici005";  // We can change the values
        icici.printDetails();

    }
}
