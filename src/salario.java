import java.util.Locale;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int horas = scan.nextInt();
        float horaTrabalhada = scan.nextFloat();

        float salary = horas * horaTrabalhada;

        System.out.println("Number = " + number);
        System.out.printf("Salary = U$ %.2f%n", salary);

    }
}
