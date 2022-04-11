public interface A {
    default void f() {
        System.out.println("a");
    }

    int sum(int x, int y);
}
