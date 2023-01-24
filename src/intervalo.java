import java.util.Locale;
import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double intervalo1 = 25.0000;
        double intervalo2 = 50.0000;
        double intervalo3 = 100.0000;

        double entrada = scan.nextDouble();

        if (entrada == intervalo1) {
            System.out.println("Intervalo [0,25]");
        } else if (entrada > intervalo1 && entrada < intervalo2) {
            System.out.println("Intervalo (25,50]");
        } else if (entrada > intervalo2) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

    }
}
