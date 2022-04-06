import java.util.HashSet;

public class MemoryTest {
    public static void main(String[] args) {
        Student s1 = new Student("Hayk", 20);
        Student s2 = new Student("Hayk", 20);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        System.out.println(students.contains(s2));

        System.out.println("---------------");
        String a = new String("Hello");
        String b = "Hello";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        // immutable
        String s = a.toLowerCase();
        System.out.println(s);

        String name = "Hayk";
        String surname = "Avdalyan";
        String result = "barev " + name + " " + surname + " 2022";
        System.out.println(result);
        StringBuilder sb = new StringBuilder();

        String result2 = sb.append("barev ")
                .append(name)
                .append(" ")
                .append(surname)
                .append(" 2022").toString();
        System.out.println(result2);

        Integer i = Integer.valueOf(128);
        Integer i2 = 128;
        System.out.println(i == i2);
    }
}
