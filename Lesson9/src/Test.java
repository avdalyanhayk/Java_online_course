public class Test {
    public static void main(String[] args) {
        int a = 0x4F;
        System.out.println(a);

        //5!  = 1*2*3*4*5
        System.out.println(fact(9));
        System.out.println(factR(9));
        System.out.println(fib(7));

        JavaProgrammer j = new JavaProgrammer();// instance
        System.out.println(Programmer.COUNTRY);
    }

    // 1 1 2 3 5 8 13 21 34

    public static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    //fib(5) = fib(4) + fib(3) = 5
    //fib(4) = fib(3) + fib(2) = 2 + 1 = 3
    //fib(3) = fib(2) + fib(1) = 1 + 1 = 2

    public static int factR(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factR(n - 1);
    }

    //factR(5) = 5 *  factR(4) =5 *  4 * factR(3) = 5*4*3*factR(2)
    //=5*4*3*2*factR(1)=5*4*3*2*1

    public static int fact(int n) {
        int r = 1;
        for (int i = 2; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}
