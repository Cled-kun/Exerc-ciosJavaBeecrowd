import java.util.Locale;
import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.println("nome: ");
            String nome = scanner.next();
            if (nome.equals("0"))
                break;
            System.out.println("idade: ");
            int idade = scanner.nextInt();
            System.out.println(nome + " " + idade + " anos");
        }
    }

}
