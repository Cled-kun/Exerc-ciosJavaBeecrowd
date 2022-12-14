import java.util.Locale;
import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.print("*********************************\n");
            System.out.print("nome: ");
            String nome = scanner.next();
            if (nome.equals("fim")) {
                System.out.println("Processo Finalizado");
                break;
            }
            System.out.print("idade: ");
            int idade = scanner.nextInt();
            System.out.println(nome + " " + idade + " anos");
            System.out.print("Se não houver mais lista, digite: acabou\n");
        }
    }

}
