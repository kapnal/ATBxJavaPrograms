package src.oops_11_14Jan.innerclass;

public class Lab159 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am a Thread");
            }
        };
        runnable.run();
    }
}
