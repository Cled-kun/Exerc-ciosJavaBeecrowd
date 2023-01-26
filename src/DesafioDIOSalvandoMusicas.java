import java.util.Scanner;

public class DesafioDIOSalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        System.out.println (arquivoDoPc.contains(".mp3") ? "Salvar" : "Deletar");

        }
    }
