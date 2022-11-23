import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma nota entre 0 a 10: ");
        int nota = scanner.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.print("Número inválido! Digite novamente: ");
            nota = scanner.nextInt();
        }

    }
}
