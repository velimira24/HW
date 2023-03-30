/**
 * taskhw2111
 */
public class taskhw2111 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = { 3, 2, 1 };
        System.out.print(shuffle(s, index));
    }

    public static String shuffle(final String s, final int[] index) {
        String new1 = "";
        for (int i = 0; i < index.length; i++) {
            char chars = s.charAt(index[i] - 1);
            new1 = addChar(new1, chars, i);
        }
        return new1;
    }

    public static String addChar(String str, char ch, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, ch);
        return sb.toString();
    }

}