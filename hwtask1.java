import java.util.Scanner;

public class hwtask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[999];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * (i + 1) * (i + 1);
        }
        System.out.println("Введите два числа: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Кубы этих чисел равны: " + array[a - 1] + " и " + array[b - 1]);

    }
}
