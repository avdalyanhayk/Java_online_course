public class VarargTest {
    public static void main(String[] args) {
        sum(4, 5);
        sum(4, 5, 5);
        sum(new int[]{4, -9, 1});
        f(4);
        f(4, 6);
        f(4, 6, 9);
        f();
        f(new int[]{4, 5, 6, 7});
        g(4, 45.4);
        g(4, 45.4, new Student());
        g(4, 45.4, new Student[]{new Student()});
    }

    static void g(int x, double s, Student... students) {

    }

    static void f(int... a) {
        int s = 0;
        for (int x : a) {
            s += x;
        }
        System.out.println(s);
    }

    static void f(int x) {
        System.out.println(0);
    }

    static void sum(int x, int y) {

    }

    static void sum(int x, int y, int z) {

    }

    static void sum(int[] x) {

    }
}
