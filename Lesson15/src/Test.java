import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4, 1, 6, 5, 47));
        System.out.println(a);
        for (Integer x : a) {
            s.push(x);
        }
        System.out.println(s.peek());
        a.clear();
        while (!s.isEmpty()) {
            a.add(s.pop());
        }
        System.out.println(a);

        String text = "45641215da}{s54[sda]gg()}"; // {[}]

        System.out.println(isCorrect(text));
    }

    static boolean isCorrect(String t) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
                continue;
            }
            switch (c) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
