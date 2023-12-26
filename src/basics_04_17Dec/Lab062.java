package src.basics_04_17Dec;

public class Lab062 {
    public static void main(String[] args) {
        //JDK 13
        int itemcode =007;
        switch (itemcode){
            case 001, 002, 003:
                System.out.println("It is an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It is an mechanical device!");
                break;
            default:
                System.out.println("It is an software product!");
        }
    }
}
