import java.util.Scanner;

public class idadeEmDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idadeDias = scan.nextInt();

        int ano = idadeDias / 365;
        idadeDias = idadeDias % 365;
        int mes = idadeDias / 30;
        idadeDias = idadeDias % 30;
        int dias = idadeDias;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
