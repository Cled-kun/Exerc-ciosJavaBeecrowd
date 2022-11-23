import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();
        float totalCombustivel = scan.nextFloat();

        float consumoMedio = distancia / totalCombustivel;

        System.out.printf("%.3f km/l%n", consumoMedio);
    }
}