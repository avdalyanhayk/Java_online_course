public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("T1");
        t1.start();

        MyThread t2 = new MyThread("T2");
        t2.start();

        Thread t3 = new Thread(new MyRunnable("T3"));
        t3.start();


        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        t4.start();
    }
}
