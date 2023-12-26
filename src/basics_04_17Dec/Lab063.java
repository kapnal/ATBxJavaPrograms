package src.basics_04_17Dec;

public class Lab063 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode){
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Hello!");
        }
    }
}
