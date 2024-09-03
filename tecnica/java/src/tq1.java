import java.util.Scanner;
public class tq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
        sc.close();

    }
}