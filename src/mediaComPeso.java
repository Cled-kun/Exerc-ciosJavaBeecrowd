import java.util.Locale;
import java.util.Scanner;

public class mediaComPeso {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 5;

        A = A * peso1;
        B = B * peso2;
        C = C * peso3;

        double media = (A + B + C) / (peso1 + peso2 + peso3);

        System.out.printf("MEDIA = %.1f%n", media);

    }
}
