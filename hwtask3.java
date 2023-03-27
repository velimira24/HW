import java.util.Scanner;

public class hwtask3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out
                    .println("Это простой калькулятор. Он совершает следующие операции с целыми числами: +, -, % и *.");
            System.out.println("Введите первое число:");
            int a = scan.nextInt();
            System.out.println("Введите операцию:");
            char operation;
            operation = scan.next().charAt(0);
            System.out.println("Введите второе число: ");
            int c = scan.nextInt();
            System.out.println(" = ");

            int result;
            switch (operation) {
                case '+':
                    result = a + c;
                    System.out.println(result);
                    break;
                case '-':
                    result = a - c;
                    System.out.println(result);
                    break;
                case '*':
                    result = a * c;
                    System.out.println(result);
                    break;
                case '/':
                    result = a / c;
                    System.out.println(result);
                    break;
            }

        }

    }
}
