public class CounterThread extends Thread {
    private String name;
    private Counter counter;

    public CounterThread(String name, Counter counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Starting count process for thread " + name);
        counter.count(name);
        System.out.println("Ending count process for thread " + name);
    }
}
