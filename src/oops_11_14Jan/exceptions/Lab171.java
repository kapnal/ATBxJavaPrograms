package src.oops_11_14Jan.exceptions;

public class Lab171 {
    public static void main(String[] args) {
        extracted2();
}

    private static void extracted2() {
        extracted();
        System.out.println("I will not execute");
    }
    private static void extracted1() {
        extracted();
    }
    private static void extracted() {
        try {
            String name = null;
            name.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
