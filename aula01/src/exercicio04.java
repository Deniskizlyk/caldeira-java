import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        double salarioMin = 1320.00d, salario, salariosRecebidos;

        System.out.println("Digite seu salário: ");
        salario = scanner.nextDouble();

        salariosRecebidos = salario / salarioMin;
        System.out.println("Você recebe " + salariosRecebidos + " salários mínimos por mês");


        scanner.close();
    }
}
