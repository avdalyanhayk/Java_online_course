import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        Integer[] i = {1, 3};
        Double[] d = {1.54, 3.14};
        print(i, d);
        // print(d);
        Student[] s = {};
//        System.out.println(max(i));
//        System.out.println(max(d));
//        System.out.println(max(s));

        List<String> ss;
    }

    static <T extends Comparable<T>, E extends Student> T max(T[] array, E t) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }

    static <EsimInch> void print(EsimInch[] a, EsimInch[] b) {
        for (EsimInch e : a) {
            System.out.print(e + " ");
        }
        System.out.println();

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
