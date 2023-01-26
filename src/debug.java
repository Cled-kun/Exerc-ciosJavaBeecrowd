public class debug {
    public static void main (String[]args) {

        System.out.println("Iniciando o método main.");
        a();
        System.out.println("Finalizando o método main");
    }

    static void a() {
        System.out.println("Iniciando o método a");
        b();
        System.out.println("Finalizando o método a");
    }
    static void b(){
        System.out.println("Iniciando o método b");
        c();
        System.out.println("Finalizando o método b");
    }
    static void c() {
        System.out.println("Iniciando o método c");
        for (int i = 0; i <= 5; i++) System.out.print(i + " ");
        System.out.println("\nFinalizando o método c");
    }

}
