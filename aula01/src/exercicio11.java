import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");

        String entrada = scanner.nextLine().toLowerCase();

        int vowelCounter = 0;

        for (int i = 0; i < entrada.length(); i++) {

            char letter = entrada.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCounter++;
            }
        }

        System.out.println("O número de vogais na entrada é: " + vowelCounter);

        scanner.close();
    }
}

