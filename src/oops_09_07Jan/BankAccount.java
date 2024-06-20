package src.oops_09_07Jan;

public class BankAccount {

    String bankName;
    int balance;
    String bankCode;

    BankAccount(){
        bankName="SBI";
        bankCode="SBI001";
        System.out.println("Default Constructor");
    }

    BankAccount (String bName, String bCode){
        this.bankName=bName;
        this.bankCode=bCode;
        System.out.println("Parameterised Constructor");
    }

    void printDetails(){
        System.out.println("Bank Name "+ this.bankName);
        System.out.println("Bank Code " +this.bankCode);
        System.out.println("Bal "+ this.balance);
    }

}
