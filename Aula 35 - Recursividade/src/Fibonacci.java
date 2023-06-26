public class Fibonacci {
    public static int sequencia(int termo) { // 1 1 2 3 5 8 13 21 ...

        if (termo <= 2) {
            return 1;
        }

        return sequencia(termo -2 ) + sequencia(termo -1 );
    }
}