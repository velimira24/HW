
import java.util.Scanner;

public class hwtask2 {
    static int[] Random_array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

        }
        return array;
    }

    static void Print_array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scan.nextInt();
        int[] nums = new int[n];
        Random_array(nums);
        Print_array(nums);
        System.out.println(("Введите число, на которое надо умножить элементы массива"));
        int a = scan.nextInt();
        int nums2[] = new int[n];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[i] * a;
        }
        Print_array(nums2);
    }
}

