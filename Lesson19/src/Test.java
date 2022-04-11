import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Musician pianist = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing piano");
            }
        };
        pianist.playMusic();

        Musician guitarist = () -> System.out.println("Playing guitar");
        guitarist.playMusic();

        Message sms = x -> System.out.println("Sending SMS: " + x);

        sms.sendMessage("Hello");

        A z = (a, b) -> {
            System.out.println("barev");
            return a + b;
        };
        System.out.println(z.sum(4, 6));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 9, 7, 1));
        for (Integer x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println();
        numbers.forEach(x -> System.out.print(x + " "));
        System.out.println();

        List<String> names = new ArrayList<>();
        names.add("Hayk");
        names.add("Anna");
        names.add("Karen");

        List<String> r = names.stream()
                .filter(a -> a.length() <= 4)
                .map(C::convert)
                .collect(Collectors.toList());
        System.out.println(r);

//        List<String> r = new ArrayList<>();
//        for (String n : names) {
//            r.add(n.toUpperCase());
//        }
//        System.out.println(r);

    }


}
