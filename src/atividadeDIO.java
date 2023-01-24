import java.util.Scanner;

public class atividadeDIO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declaraçao do vetor
        int[] vetor = new int[6];
        
        // declaracao de variavel
        int num;
        
        // entrada de dados -> vetor
        for(int i = 1; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i + ":");
            vetor[i] = scan.nextInt();
        }
        
        // entrada de dados -> variável
        System.out.println("Digite um valor para procurar no vetor");
        num = scan.nextInt();
        
        // leitura do vetor
        for(int i = 0; i < vetor.length; i++){
            
            // se existir no vetor o número digitado
            if(vetor[i] == num){
                System.out.println("O número " + num + " digitado está na posição " + i);
            // se não existir...
            } else if(i == vetor.length-1){
                System.out.println("Número não encontrado na lista");
            }
        }
    }   
}