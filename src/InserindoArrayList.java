import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InserindoArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> lista = new ArrayList<>();
        String foo;

        foo = scan.nextLine();

        lista.add(foo);

        lista.add(scan.nextLine());
        lista.add(scan.nextLine());
        lista.add(scan.nextLine());

        // System.out.println("Deseja adicionar mais?\n1 - SIM\n2 - NÃO");
        // int opcao = scan.nextInt();

        System.out.println(lista);
    }
}
