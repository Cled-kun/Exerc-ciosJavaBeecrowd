import java.util.Scanner;

public class atividadesDeLogica {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o total de votos obtidos em Konoha: ");
        int total = scan.nextInt();
        System.out.println("Votos brancos: ");
        int brancos = scan.nextInt();
        System.out.println("Votos nulos: ");
        int nulos = scan.nextInt();
        System.out.println("Votos válidos: ");
        int validos = scan.nextInt();

        System.out.println("Total: " + total);
        System.out.println("Brancos: " + " %");
        System.out.println("Nulos: " + (total - nulos) / 100 + " %");
        System.out.println("Válidos: " + (total - validos) / 100 + " %");

    }
}
