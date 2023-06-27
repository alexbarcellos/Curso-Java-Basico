public class Somatorio {
    public static int somar(int termos) {

        if (termos == 1) {
            return 1;
        }
        return termos + somar(termos - 1);
    }
}
