import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DesafioDIOImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String texto = scan.nextLine();
        String space = "";

        String[] textoSeparado = texto.split("/");

        String[] cabecalho = {"Imovel: ", "R$ ", " "};

        for (int i=0; i < cabecalho.length; i++) {
            System.out.print(cabecalho[i] + textoSeparado[i]);
        }
    }
}
