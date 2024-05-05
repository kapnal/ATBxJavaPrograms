package src.practiceoops;

public class Lab002 {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        System.out.println("-------------");

        BankAccount hdfc = new BankAccount("HDFC","hdfc001");
        hdfc.printDetails();

        System.out.println("-------------");

        BankAccount icici = new BankAccount("ICICI","icici002");
        icici.printDetails();

    }
}
