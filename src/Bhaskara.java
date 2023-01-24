import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double delta = Math.pow(B, 2) - (4 * A * C);
        double R1 = (-B + Math.sqrt(delta)) / (2 * A);
        double R2 = (-B - Math.sqrt(delta)) / (2 * A);

        if (delta > 0 && A != 0) {
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        } else {
            System.out.println("Impossivel calcular");
        }

    }
}
