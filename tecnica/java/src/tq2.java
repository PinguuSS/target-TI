import java.util.Scanner;

public class tq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para verificar pertencente à sequência de Fibonacci: ");
        int num = sc.nextInt();

        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;

        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }

        return c == num;
    }
}
