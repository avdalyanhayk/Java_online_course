import java.util.HashMap;
import java.util.Map;

public class MyBox<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        MyBox<String> stringBox = new MyBox<>();
        stringBox.setT("Hayk");
        System.out.println(stringBox.getT());

        MyBox<User> userBox = new MyBox<>();
        userBox.setT(new User("", "a",":"));
        Map<Integer, String> m = new HashMap<>();
        m.put(4,"");
    }
}
