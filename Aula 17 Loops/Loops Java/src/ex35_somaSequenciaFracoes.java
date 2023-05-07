import java.util.Scanner;

public class ex35_somaSequenciaFracoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;

        System.out.println("\n H = 1/1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n");
        System.out.print("Entre o n-ésimo numero da sequencia H: ");
        double nFinal = scan.nextDouble();

        for ( double n=1 ; n <= nFinal ; n ++ ) {
            System.out.print("1/" + (int) n + "   "); // Feito cast de: *double n* para *(int) n*
            soma += ( 1 / n ) ;
        }

        System.out.print("\nSoma da Sequencia     H = " + soma + "\n\n");
        scan.close();
    }
}