import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Seu nome é: " + nome);

        scan.close();
    }
}
