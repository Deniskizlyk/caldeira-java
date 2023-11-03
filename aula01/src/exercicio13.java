import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro não negativo:");
        int number = scanner.nextInt();


        if (number >= 0) {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("O fatorial de " + number + " é: " + factorial);

        } else {
            System.out.println("O número deve ser não negativo.");
        }

        scanner.close();
    }
}
