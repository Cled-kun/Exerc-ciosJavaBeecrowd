import java.util.Scanner;

public class conversaoDeTempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalSegundos = scan.nextInt();

        int tempoHora = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;
        int tempoMinuto = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;
        int tempoSegundos = totalSegundos;

        System.out.println(tempoHora + ":" + tempoMinuto + ":" + tempoSegundos);

    }
}
