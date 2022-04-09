public class ThreadTest2 {
    static int[] a = {4, 3, -7, 0, 78, 9};
    static int max = a[0];

    public static void main(String[] args) {
        Thread maxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < a.length; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (max < a[i])
                        max = a[i];
                }
            }
        });
        maxThread.start();

        System.out.println("Barev");
        System.out.println("Hello");

//        try {
//            maxThread.join(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(max);

        while (maxThread.isAlive()) {

        }
        System.out.println(max);
    }
}
