public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String n) {
        name = n;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
