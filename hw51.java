import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hw51 {

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов Иван Иванович", 222222987, bookPhone);
        addNumber("Иванов Иван Иванович", 1234567, bookPhone);
        addNumber("Федоров Федор Федорович", 61234567, bookPhone);
        addNumber("Федоров Федор Федорович", 31234567, bookPhone);
        addNumber("Собакина Людмила Борисовна", 1246689, bookPhone);
        addNumber("Никитенко Людмила Вапловна", 5677899, bookPhone);
        System.out.println(bookPhone);
    }
}