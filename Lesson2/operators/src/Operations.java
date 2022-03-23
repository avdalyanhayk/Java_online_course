public class Operations {
    public static void main(String[] args) {
        int x1;
        int $x;
        int _x = 9;
        System.out.println(_x);
        int a45 = 92;
        System.out.println(a45);

        String firstName = "Hayk";
        String first_name = "Hayk";
        System.out.println(firstName);
        String firstNameOfTheBestStudent = "Hayk";


        int a = 4, b = 3;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        System.out.println(a * b);

        int x = 7, y = 5;
        System.out.println(x / y);
        System.out.println(x % y);

        double t = 7.0, p = 5.0;
        System.out.println(t / p);

        x = 5;
        x = x + 1;
        x++;
        ++x;
        System.out.println(x);

        x = 4;
        System.out.println(++x);
        System.out.println(x);

        x = 3;
        y = 4;
        c = x++ - --y; // c = 3 - 3 = 0
        // x = 4, y = 3
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("c = " + c);

        System.out.println("--------------------");
        x = 7;
        y = 8;
        c = ++x + y--;//8 + 8 = 16 , x = 8, y = 7
        System.out.println(x++);//print 8 , x = 9
        System.out.println(c);// 16
        System.out.println(x);// 9
        System.out.println(--y);// y = 6, print 6
        System.out.println(y);// 6

        boolean bb = x == 9;
        System.out.println(bb);

        System.out.println(x != 9);
        System.out.println(x > 4);
        System.out.println(x <= 44);

        x = 41;
        System.out.println(x % 2 == 0);

        System.out.println(x >= 1 && x <= 9);
        boolean mianish = x >= 1 && x <= 9;

        boolean vv = x < 0 || x > 100;

        vv = false;
        System.out.println(!vv);

        System.out.println(x > 4 && (x % 2 == 0 || x < -8));


        System.out.println(5 & 8);
        System.out.println(5 | 8);
        System.out.println(17 & 24);
        System.out.println(8 ^ 5);

        x = 7;
        x += 2;
        System.out.println(x);
        x = 17;
        x = x & 9;
        x &= 9;
    }
}
