package src.basics_01_10Dec;

public class BankAccount {
    
    String bankName;
    String bankCode;
    int balance;

BankAccount(){
    bankName="HDFC";
    bankCode="HDFC001";
    balance=1000;
    System.out.println("Default Bank");
}
    BankAccount(String bName,String bCode,int bal){
        this.bankName=bName;
        this.bankCode=bCode;
        this.balance=bal;
    }

    void printDetails(){
        System.out.println("Bank Name is " + this.bankName);
        System.out.println("Bank Code is " + this.bankCode);
        System.out.println("Bank Balance " + this.balance);
    }

}
