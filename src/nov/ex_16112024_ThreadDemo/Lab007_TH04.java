package nov.ex_16112024_ThreadDemo;

public class Lab007_TH04 {
    public static void main(String[] args) {
        Runnable w1 = new WorkerTH04();
        Thread t1 = new Thread(w1);
        t1.start();
        Runnable w2 = new WorkerTH04();
        Thread t2 = new Thread(w2);
        t1.start();

    }
}

class WorkerTH04 implements Runnable {


    WorkerTH04() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}