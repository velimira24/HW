import java.util.HashMap;
import java.util.Scanner;

public class hwtask23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строчек в книге:");
        int n = scan.nextInt();
        String[] arrayBook = new String[n];
        for (int i = 0; i < arrayBook.length; i++) {
            System.out.println("Заполните строку в книге:");
            arrayBook[i] = scan.next();
        }

        System.out.println("Введите количество продуктов, на которые у человека аллергия:");
        int m = scan.nextInt();
        String[] arrayChanges = new String[m];
        for (int i = 0; i < arrayBook.length; i++) {
            System.out.println("Заполните строку в книге:");
            arrayBook[i] = scan.next();
        }

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < arrayChanges.length; i++) {
            String[] arr = arrayChanges[i].split(" - ");
            map.put(arr[0], arr[1]);
        }

        HashMap<String, String> mapp = new HashMap<String, String>();

        for (int i = 0; i < arrayChanges.length; i++) {
            String[] arr = arrayChanges[i].split(" - ");
            map.put(arr[0], arr[1]);
        }

        for (String string : arrayBook) {
            String arrBookStr = string;
            String[] arrBookStrArr = arrBookStr.split(" ");
            for (int i = 0; i < arrBookStrArr.length; i++) {
                if (map.containsKey(arrBookStrArr[i].toLowerCase())) {
                    String str = map.get(arrBookStrArr[i].toLowerCase());
                    if (arrBookStrArr[i] != arrBookStrArr[i].toLowerCase()) {
                        str = str.substring(0, 1).toUpperCase() + str.substring(1);
                    }
                    arrBookStrArr[i] = str;
                }
            }
            String str = String.join(" ", arrBookStrArr);
            System.out.println(str);
        }

    }
}