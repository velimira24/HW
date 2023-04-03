import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hwtask33 {
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
        int max = 0;
        int min = 0;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);

            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
            sum = sum + list.get(i);
        }
        average = sum / list.size();
        System.out.printf("Максимальный элемент: %s\n", max);
        System.out.printf("Минимальный элемент: %s\n", min);
        System.out.print(average);
        System.out.print(",");
        System.out.println(sum % list.size());
    }

}