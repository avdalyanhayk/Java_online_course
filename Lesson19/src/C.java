public class C implements A, B {

    @Override
    public void f() {
        A.super.f();
        System.out.println("C");
        B.super.f();
    }

    @Override
    public int sum(int x, int y) {
        return 0;
    }


    public static String convert(String a) {
        return "hello " + a;
    }

}
