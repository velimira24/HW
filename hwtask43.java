import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class hwtask43 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        boolean a = true;
        for (int i = 0; i < deque.size() / 2; i++) {
            if (deque.pollFirst() != deque.pollLast()) {
                a = false;
                break;
            }

        }
        System.out.println(a ? "Палиндром" : "Не палиндром");

    }
}