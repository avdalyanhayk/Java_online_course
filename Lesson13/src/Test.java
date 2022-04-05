import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(45);
        a.add(4);
        a.add(45);
        a.add(1);
        a.add(45);
        System.out.println(a);
        a.add(0, 7);
        System.out.println(a);
        a.remove(1);
        System.out.println(a);

        a.remove(Integer.valueOf(45));
        System.out.println(a);
        a.set(2, -7);
        System.out.println(a);
        System.out.println(a.indexOf(455));
        System.out.println(a.get(0)); //a[0]
        System.out.println(a.size());

        for (int i = 0; i < a.size(); i++) {//a.length
            if (a.get(i) % 2 != 0)//a[i]
                System.out.print(a.get(i) + " ");//a[i]
        }
        System.out.println();
        System.out.println(a.contains(7546));


        List<String> s = new ArrayList<>(Arrays.asList("trt", "s"));
        System.out.println(s);

        ArrayList<Integer> ab = new ArrayList<>() {
            {
                add(1);
                add(4);
                add(6);
            }
        };

        List<Integer> n = new ArrayList<>(Collections.nCopies(10, 1));
        List<Integer> n2 = new ArrayList<>(Collections.nCopies(5, 2));
        n.addAll(n2);
        System.out.println(n);

        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);

        List<String> names = new ArrayList<>();
        names.add("Hayk");
        names.add("Anna");
        names.add("Karen");
        names.add("Babken");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Hayk", 20,3000));
        humans.add(new Human("Anna", 30,1000));
        humans.add(new Human("Babken", 25,9000));
        System.out.println(humans);

        Collections.sort(humans, new AgeComparator().reversed());
        System.out.println("---" + humans);
        Collections.sort(humans, new NameComparator());
        System.out.println(humans);

        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });
        System.out.println(humans);

//        Human h1 = new Human("A",29);
//        Human h2 = new Human("B",23);
//        System.out.println(h1.compareTo(h2));


    }
}
