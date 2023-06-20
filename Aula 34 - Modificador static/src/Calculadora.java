public class Calculadora {

    public static int soma(int a, int b) {
        return ( a + b );

    }

    public static int soma(int a, int b, int c) {
        return ( a + b + c );

    }

    public static double soma(double a, double b, double c) {
        return ( a + b + c );

    }
    
    public static int soma(int[] vetor) {
        int total = 0;

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }

        return total;

    }
}
