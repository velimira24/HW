import java.util.Scanner;

public class hwtask211 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sample = "aaaAbbbBB";
        int count1 = 0;
        int count2 = 0;
        char a = 'a';
        char b = 'B';
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) == a) {
                count1++;
            }
            if (sample.charAt(i) == b) {
                count2++;
            }
        }
        System.out.print(count1);
        System.out.print("a");
        System.out.print("В");
        System.out.println(count2);
    }
}