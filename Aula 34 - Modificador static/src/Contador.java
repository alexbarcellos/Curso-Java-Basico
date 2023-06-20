public class Contador {
    private static int cont;

    public Contador() {
        cont++;
    }

    public static void decrementar() {
        cont--;
    }

    public static void incrementar() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static void obterValor() {
        System.out.println("Contador: " + cont);
    }
}
