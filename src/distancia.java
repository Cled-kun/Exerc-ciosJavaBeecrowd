import java.util.Locale;
import java.util.Scanner;

public class distancia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();
        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");
    }
}
