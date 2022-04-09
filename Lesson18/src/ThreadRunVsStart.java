public class ThreadRunVsStart {
    public static void main(String[] args) {
        Thread t = new MyThread("t");
        t.start();

        System.out.println("Main is working");
    }
}
