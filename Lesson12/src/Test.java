import javax.lang.model.element.Name;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        try {
            System.out.println("a");
            FileReader fr = new FileReader("ip.txt");
            System.out.println("b");
            String s = "null";
            System.out.println(s.length());
            // System.out.println(args[1]);
        } catch (NullPointerException e) {
            System.out.println("d");
        } catch (ArithmeticException e) {
            System.out.println("c");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("End");

        try {

        } finally {
            System.out.println("Hello");
        }


        Human human = new Human();
        try {
            human.setName("Asdasdasd");
            System.out.println(human.getName());
        } catch (NameException e) {

        }
        try {
            human.setYear(1800);
        } catch (YearException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("aaaaaaaaa");

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Enter name");
//        while (true) {
//            String name = sc.next();
//            try {
//                human.setName(name);
//                System.out.println("Thanks " + human.getName());
//                break;
//            } catch (NameException e) {
//                System.out.println("Invalid name. enter one more time");
//            }
//        }

        String n = "79.549asdf8";
        System.out.println(isNumber(n));

        int x = 4;
        assert sum(4) == 5;
        assert sum(-4) == -3;
        assert sum(0) == 1:"0 i depkna";
        System.out.println("end");
    }

    static int sum(int x) {
        if (x == 0)
            return 0;
        return x + 1;
    }

    private static boolean isNumber(String n) {
        try {
            Double.parseDouble(n);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
