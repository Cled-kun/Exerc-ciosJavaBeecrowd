import java.util.Scanner;

public class desafioDIOCamarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        int count = 0;

        for (int i = 0; i <= tamanhoDaFila; i++) {
            if (i % 2 != 0) {
                //System.out.print(i + ", ");
                count++;
            }
        }
        System.out.print(count + " pessoas no camarote");
    }
}