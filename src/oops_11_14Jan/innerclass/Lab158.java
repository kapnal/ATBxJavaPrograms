package src.oops_11_14Jan.innerclass;

public class Lab158 {
    public static void main(String[] args) {

        Thread t = new Thread(){
            @Override

            public void run(){
                System.out.println("I am Thread");
            }
        };
        t.run();
    }
}
