import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.Random;

public class hwtask44 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину списков:");
        int n = scan.nextInt();
        Random rand = new Random();
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList());
        for (int i = 0; i < n; i++) {
            int number = rand.nextInt(0, 10);
            d1.add(number);
        }
        System.out.println(d1);
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList());
        for (int i = 0; i < n; i++) {
            int number = rand.nextInt(0, 10);
            d2.add(number);
        }
        System.out.println(d2);
        Deque<Integer> d3 = new ArrayDeque<>(Arrays.asList());
        for (int i = 0; i < n; i++) {
            d3.add(d1.pollFirst() + d2.pollFirst());

        }
        System.out.println(d3);
    }
}
