package nov.ex_16112024_ThreadDemo;

public class Lab006_TH03 {

    public static void main(String[] args) {
        //Task 1 : Go from  1 to 5

        ThreadGroup threadGroup = new ThreadGroup("Workers");
        WorkerTH03 w1 = new WorkerTH03(threadGroup,"W1");
        w1.start();
        WorkerTH03 w2 = new WorkerTH03(threadGroup,"W2");
        w2.start();

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

class WorkerTH03 extends Thread{


    WorkerTH03 (ThreadGroup threadGroup, String name){
        super(threadGroup, name);
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

        super.run();
    }
}
