import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double R = scan.nextDouble();

        double volume = ((4.0 / 3) * 3.14159) * (R * R * R);

        System.out.printf("Volume = %.3f%n", volume);

    }

}
