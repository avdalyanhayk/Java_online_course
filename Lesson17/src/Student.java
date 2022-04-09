import java.util.ArrayList;

public class Student {
    private String name = findName();


    private double mark;

    {
        name = "Hayk";
        System.out.println("Value of Name is set");
    }

    {
        System.out.println("a");
        mark = 45.4;
    }

    public Student() {
        System.out.println("constructor");
        mark = 98.5;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.mark);
        ArrayList<Integer> a = new ArrayList<>() {
            {
                add(4);
                add(14);
                add(49);
            }
        };
    }

    private final String findName() {
        return "Hayk";
    }

}
