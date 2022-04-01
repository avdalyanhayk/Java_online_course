public class Human {
    public String name;
    public int year;

    public static int count = 0;

    public Human() {
        count++;
        System.out.println("barev");
    }

    static int a;
    public static int b;
    public static int c;


    static {
        a = 45;
        b = 15;
    }

    static {
        c = 45;
    }

    static {
        a = 45;
        System.out.println("value of a is set to 45");
        b = 15;
    }

    static {
        a = 45;
        System.out.println("value of a is set to 45");
        b = 15;
    }
}
