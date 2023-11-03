import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantia em dólares:");
        double dollar = scanner.nextDouble();

        System.out.println("Digite a taxa de câmbio:");
        double cambio = scanner.nextDouble();

        double convertido = dollar * cambio;

        System.out.println("A quantia convertida é: " + convertido);

        scanner.close();
    }
}
