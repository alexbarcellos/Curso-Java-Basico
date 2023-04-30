public class ex09_imparesAte50 {
    public static void main(String[] args) {
        System.out.println("\nNúmeros ímpares de 0 a 50");

        for ( int i=1 ; i < 50 ; i++ ) {
            int impar = i%2;
            if (impar != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
