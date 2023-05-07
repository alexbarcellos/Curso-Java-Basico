import java.util.Scanner;

public class ex34_sequenciaNumericaSoma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;

        System.out.println("\n1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m");
        System.out.print("Entre o n-ésimo numero da sequencia: ");
        double nFinal = scan.nextDouble();

        for ( double n=1,  m=1 ; n <= nFinal ; n++, m +=2 ) {
            System.out.print(n + "/" + m + "   ");
            soma += ( n / m ) ;
        }

        System.out.print("\nSoma da Sequencia     S = " + soma + "\n\n");
        scan.close();
    }
}
