import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>(Arrays.asList(4, 5, 2, 4, 8, 9, 7, 12, 16, 7, 17, 4, 7));
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        System.out.println("-------");
        for (Integer x : a) {
            System.out.println(x);
        }
        System.out.println("--------------------------");
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer x = iterator.next();
            System.out.println(x);
        }

        System.out.println("Remove even elements");
        System.out.println(a);
//        for (int i = a.size() - 1; i >= 0; i--) {
//            if (a.get(i) % 2 == 0) {
//                a.remove(i);
//            }
//        }
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (x % 2 == 0)
                it.remove();
        }
        System.out.println(a);

        Vector<Integer> s = new Vector<>(6);
        s.add(4);
        s.add(458);
        s.add(58);
        System.out.println(s.size());
        System.out.println(s.capacity());


        TreeSet<Integer> hset = new TreeSet<>(Collections.reverseOrder());
        hset.add(4);
        hset.add(1);
        hset.add(4);
        hset.add(3);
        hset.add(1);
        hset.add(17);
        System.out.println(hset);

        String[] names = {"Hayk", "Aram", "Karen", "Aram", "Karen"};
        HashSet<String> sss = new HashSet<>(Arrays.asList(names));

        System.out.println(sss);

//        TreeSet<Human> tset = new TreeSet<>();
//        tset.add(new Human("",456));
//        tset.add(new Human("",456));
//        tset.add(new Human("",456));
//        System.out.println(tset);


        String p = "Hello from Java Hello 2022 Lesson 2022";
        //Hello from Java 2022 Lesson
        String[] s1 = p.split(" ");
        LinkedHashSet<String> lhset = new LinkedHashSet<>(Arrays.asList(s1));
        System.out.println(lhset);
        for (String x : lhset) {
            System.out.print(x + " ");
        }


    }
}
