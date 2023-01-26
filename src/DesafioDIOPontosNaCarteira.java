import java.util.Scanner;

public class DesafioDIOPontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int velocidadePermitida = 80;
        int PontosNaCarteira = 3;
        int count = 0;

        do {
            System.out.println("");
            int entradaVelocidade = leitor.nextInt();
            int quantidadeMultas = leitor.nextInt();
            
            quantidadeMultas++;

            if (entradaVelocidade >= velocidadePermitida && quantidadeMultas < PontosNaCarteira) {
                System.out.print(quantidadeMultas + " multas. Nao levou pontos na carteira");
                
            } else {
                System.out.printf(quantidadeMultas + " multas. Levou pontos na carteira");
            }
            
            count++;
        } while (count < 3);
    }
}
