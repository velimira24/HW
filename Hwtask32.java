import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hwtask32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scan.nextInt();
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = rand.nextInt(-10, 10);
            list.add(number);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;

            } else {
            }

        }
        System.out.println("Новый список:");
        System.out.println(list);
    }

}