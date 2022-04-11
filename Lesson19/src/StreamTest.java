import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class StreamTest {

    static int f(int a) {
        for (int i = 0; i < 100000; i++) {
            a += (a * 10) ^ 7 % 4;
        }
        return a;
    }

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt());
        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            n.add(r.nextInt());
        }

        long start = System.currentTimeMillis();
        Optional<Integer> reduce = n.parallelStream().map(x -> f(x)).reduce(Integer::min);
        System.out.println(reduce.get());
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

    }
}
