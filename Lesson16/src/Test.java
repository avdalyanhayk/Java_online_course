import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "Hayk");
        map.put(6, "Anna");
        map.put(17, "Vahe");
        map.put(34, "Vahe");
        map.put(6, "Karen");
        map.put(null, "Karen");
        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.get(null));

        Set<Entry<Integer, String>> entries = map.entrySet();

        for (Entry<Integer, String> x : entries) {
            System.out.println(x.getKey() + ", " + x.getValue());
        }

        System.out.println("--------------");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + ", " + map.get(key));
        }

        //1 2 
        // mek + erkus = erek

        HashMap<Integer, MyLang> numbers = new HashMap<>();
        numbers.put(1, new MyLang("one", "Մեկ"));
        numbers.put(2, new MyLang("two", "երկուս"));
        numbers.put(3, new MyLang("three", "Երեք"));
        numbers.put(4, new MyLang("four", "Չորս"));
        numbers.put(5, new MyLang("five", "Հինգ"));
        int a = 3, b = 2;
        System.out.println(numbers.get(a).en + " + " + numbers.get(b).en + " = " + numbers.get(a + b).en);
        System.out.println(numbers.get(a).hy + " + " + numbers.get(b).hy + " = " + numbers.get(a + b).hy);

        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(4, "Hayk");
        tmap.put(6, "Anna");
        tmap.put(17, "Vahe");
        tmap.put(34, "Vahe");
        tmap.put(6, "Karen");
        System.out.println(tmap);

        HashSet<String> s = new HashSet<>();
        s.add("");


        drive(Direction.WEST);
        drive(Direction.EAST);

        drive(DirectionClass.SOUTH);

        System.out.println(DirectionClass.NORTH.value);
    }

    static void drive(DirectionClass d) {

    }


    static void drive(Direction d) {
       switch (d){
           case EAST :
               System.out.println("drive East");
               break;
           case WEST:
               System.out.println("drive WEST");
               break;
           case SOUTH:
               System.out.println("drive SOUTH");
               break;
           case NORTH:
               System.out.println("drive NORTH");
               break;
       }
    }
}
