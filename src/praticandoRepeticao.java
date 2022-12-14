import java.util.Scanner;

public class praticandoRepeticao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = { 1, 15, 35, -7 };
        int count = 0;
        boolean encontrarValor = false;

        System.out.print("Digite um número: ");
        int digite = scan.nextInt();

        while (count < num.length) {
            if (num[count] == digite) {
                encontrarValor = true;
            }
            count++;
        }
        if (encontrarValor == false) {
            System.out.printf("%d não encontrado", digite);
        } else {
            System.out.printf("Seu número %d está na posição", digite);
        }

    }
}
