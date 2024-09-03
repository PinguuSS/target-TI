import java.util.Scanner;

public class tq5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para ser invertida: ");
        String original = scanner.nextLine();

        String inverted = inverterString(original);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + inverted);

        scanner.close();
    }

    public static String inverterString(String str) {
        char[] characters = str.toCharArray();
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {

            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            start++;
            end--;
        }

        return new String(characters);
    }
}