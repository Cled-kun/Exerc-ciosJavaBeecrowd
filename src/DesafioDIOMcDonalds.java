import java.util.Scanner;

public class DesafioDIOMcDonalds {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        
        for (int i = 0; i < listaIngredientes.length;i++) {
            listaIngredientes[i] = leitor.next();
            
        }
        for (String separado : listaIngredientes) {
            System.out.print(separado + ", ");
        }
    }
}
