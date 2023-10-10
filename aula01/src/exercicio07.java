import java.util.Scanner;
public class exercicio07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Qual seu salário? ");
        double salario = scanner.nextDouble();

        if (idade >= 18 && salario > 2000.00) {
            System.out.println("Você pode comprar um carro!");
        } else {
            System.out.println("Infelizmente você não pode comprar um carro!");
        }
        scanner.close();
    }
}
