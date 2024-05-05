package src.practiceoops;

public class TH03 {

    public static void main(String[] args) {

        WorkerTh03 w1 = new WorkerTh03();
        w1.start();

//        WorkerTh03 w2 = new WorkerTh03();
//        w2.start();

        for (int i = 0; i < 5; i++){
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}

    class WorkerTh03 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++){
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

