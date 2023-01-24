import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class testeProgramador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> nucleoTecnico = new ArrayList<>();
        nucleoTecnico.add(15);
        nucleoTecnico.add(20);
        nucleoTecnico.add(43);
        nucleoTecnico.add(84);
        nucleoTecnico.add(45);
        nucleoTecnico.add(1);
        nucleoTecnico.add(99);

        System.out.println(nucleoTecnico);
        nucleoTecnico.set(4, 50);
        System.out.println(nucleoTecnico);
        System.out.println("Digite um número para ver se está na lista:");
        Integer nomeNaLista = scan.nextInt();
        if (nucleoTecnico.contains(nomeNaLista) == true) {
            System.out.println("O nome está na lista!");
        } else {
            System.out.println("O nome não está na lista");
        }
        System.out.println("O menor número é " + Collections.min(nucleoTecnico));
        System.out.println("O maior número é " + Collections.max(nucleoTecnico));

        Iterator<Integer> iterator = nucleoTecnico.iterator();
        Integer soma = 0;

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            soma += next;
        }
        System.out.print("A soma de todos os números na lista é: " + soma);

    }
}