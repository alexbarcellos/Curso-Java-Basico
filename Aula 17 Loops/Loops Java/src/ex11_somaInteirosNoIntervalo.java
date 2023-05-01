import java.util.Scanner;

public class ex11_somaInteirosNoIntervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEntre o com número Inicial: ");
        int inicio = scan.nextInt();

        System.out.print("\nEntre o com número Final:   ");
        int fim = scan.nextInt();
        int soma = 0;

        for ( int i = inicio ; i <= fim  ; i++ ) {
            System.out.print(i + " ");
            soma += i;
        }
        System.out.println("\nA soma do intervalo é " + soma);
        scan.close();
    }
}
