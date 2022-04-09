public class VolatileTest extends Thread {
    public volatile boolean isRunning = true;

    // happens before
    @Override
    public void run() {
        while (isRunning) {

        }
        System.out.println("Ended");
    }

    public static void main(String[] args) {
        VolatileTest t = new VolatileTest();
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.isRunning = false;
        System.out.println("tvecink false");
    }
}
