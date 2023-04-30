import java.util.Scanner;

public class ex10_inteirosNoIntervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEntre o com número Inicial: ");
        int inicio = scan.nextInt();

        System.out.print("\nEntre o com número Final:   ");
        int fim = scan.nextInt();

        for ( int i = inicio ; i <= fim  ; i++ ) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}
