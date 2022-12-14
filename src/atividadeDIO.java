import java.util.Scanner;

public class atividadeDIO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        int valor = leitor.nextInt();
        int count = 0;
        boolean encontrarValor = false;

        while (count < 10 && encontrarValor == false) {
            if (elementos[count] == valor) {
                encontrarValor = true;
            }
            count++;
        }
        if (encontrarValor == false) {
            System.out.printf("Numero " + valor + " nao encontrado!");
        } else {
            System.out.println("Achei " + valor + " na posicao ");
        }
    }
}