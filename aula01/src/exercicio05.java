import java.util.Scanner;
public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora, minutos, segundos;

        System.out.print("Digite uma hora [0-23]: ");
        hora = scanner.nextInt();

        System.out.print("Digite os minutos [0-59]: ");
        minutos = scanner.nextInt();

        System.out.print("Digite os segundos [0-59]: ");
        segundos = scanner.nextInt();

        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <=59) {

            int segundosQuePassaram = hora * 3600 + minutos * 60 + segundos;
            int segundosQueFaltam = 86000 - segundosQuePassaram;

            System.out.println("Segundos passados desde 0h00m00s: " + segundosQuePassaram);
            System.out.println("Segundos que faltam para a meia-noite: " + segundosQueFaltam);
        } else {
            System.out.println("Tempo inválido!");
        }
        scanner.close();
    }
}
