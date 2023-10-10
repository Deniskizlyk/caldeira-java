import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double primeiroNum, segundoNum;
        System.out.println("Digite o primeiro número: ");
        primeiroNum = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        segundoNum = scan.nextDouble();

        System.out.println("Os números são: " + primeiroNum + " e " + segundoNum);

        scan.close();
    }
}
