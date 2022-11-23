import java.util.Locale;
import java.util.Scanner;

public class gastoDeCombustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double tempo = scan.nextInt();
        double velocidadeMedia = scan.nextInt();
        double quantidadeLitros = tempo * velocidadeMedia / 12;

        System.out.printf("%.3f%n", quantidadeLitros);
    }
}
