import java.util.HashSet;

public class MemoryTest {
    public static void main(String[] args) {
        int a = 8;
        f(a);
        System.out.println(a);

        Student s1 = new Student(20, "Hayk");
        Student s2 = new Student(20, "Hayk");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        System.out.println(set.contains(s2));


        // Immutable
        String x = new String("Barev");
        String y = "Barev";
        x.toLowerCase();
        System.out.println(x);
        System.out.println("--------------");
        System.out.println(x == y);
        System.out.println(x.equals(y));

        String name = "Hayk";
        String lastName = "Avdalyan";
        String result = "Barev " + name + " " + lastName + " 2022";
        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        String s = sb.append("Barev ")
                .append(name)
                .append(" ")
                .append(lastName)
                .append(" 2022").toString();
        System.out.println(s);

        Integer i = 128;
        Integer i2 = 128;
        System.out.println(i == i2);
        System.out.println(i.equals(i2));

    }

    private static void g(Student s) {
        s = null;
    }

    private static void f(int z) {
        int b = 3;
        z = 40;
    }
}
