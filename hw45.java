import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class hw45 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>(Arrays.asList("(", ")", "[", "]"));
        boolean a = true;
        for (int i = 0; i < deque.size() / 2; i++) {

            if (deque.pollFirst().equals("(") && (deque.pollLast().equals(")"))) {
                a = true;
            } else {
                a = false;
                break;
            }
            if (deque.pollFirst().equals("{") && (deque.pollLast().equals("}"))) {
                a = true;
            } else {
                a = false;
                break;
            }
            if (deque.pollFirst().equals("[") && (deque.pollLast().equals("]"))) {
                a = true;
            } else {
                a = false;
                break;
            }
        }
        System.out.println(a ? "True" : "False");

    }

}
