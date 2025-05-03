import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean novamente = true;

        while (novamente) {
            int numero = gerador.nextInt(100);
            int tentativa = 10;

            System.out.println("Você tem " + tentativa + " tentativas.");
            System.out.println("Tente advinhar o número: ");

            for (int contador = 0; contador < tentativa; contador++) {
                System.out.print("Tentativa " + (contador + 1) + ": ");
                int input = scanner.nextInt();
                if (input < numero) {
                    System.out.println("Errado. O número é maior.");
                }
                else if (input > numero) {
                    System.out.println("Errado. O número é menor.");
                }
                else {
                    System.out.println("Você acertou!");
                    break;
                }

            }

            System.out.println("Você deseja jogar novamente? (s/n): ");
            scanner.nextLine();
            String resposta = scanner.nextLine();
            novamente = resposta.equalsIgnoreCase("s");
        }

        scanner.close();
    }
}
