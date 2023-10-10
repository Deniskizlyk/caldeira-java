import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double primeiroNum, segundoNum, terceiroNum, maiorNum, menorNum, mediaAritmetica;

        System.out.println("Digite o primeiro número: ");
        primeiroNum = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        segundoNum = scan.nextDouble();

        System.out.println("Digite o terceiro número: ");
        terceiroNum = scan.nextDouble();

        maiorNum = Math.max(Math.max(primeiroNum, segundoNum), terceiroNum);
        menorNum = Math.min(Math.min(primeiroNum, segundoNum), terceiroNum);

        mediaAritmetica = (primeiroNum + segundoNum + terceiroNum) / 3.0;

        System.out.println("O maior número é " + maiorNum);
        System.out.println("O menor númeor é " + menorNum);
        System.out.println("A média aritmética dos números é: " + mediaAritmetica);

        scan.close();
    }
}
