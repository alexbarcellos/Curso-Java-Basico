public class ex09_imparesAte50 {
    public static void main(String[] args) {
        System.out.println("\nNúmeros ímpares de 0 a 50");

        for ( int i=1 ; i < 50 ; i++ ) {
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
