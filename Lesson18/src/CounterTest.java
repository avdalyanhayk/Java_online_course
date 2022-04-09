public class CounterTest {
    public static void main(String[] args) {
        Counter c = new Counter();
        CounterThread t1 = new CounterThread("t1", c);
        CounterThread t2 = new CounterThread("t2", c);
        t1.start();
        t2.start();


    }
}
