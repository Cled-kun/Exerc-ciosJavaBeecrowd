import java.util.Scanner;

public class DesafioDIOMcDonalds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto = scan.nextLine();

        String[] textoSeparado = texto.split(";");

        for (String textoFinal : textoSeparado) {
            System.out.println(textoFinal);
        }
    }
}
