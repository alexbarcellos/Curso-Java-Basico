import java.util.Scanner;

public class ex20_cotacaoDolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] cotacoes = new double[20];

        System.out.print("\nCotação do Dollar: ");
        double dollar = scan.nextDouble();

        for (int i = 0; i < cotacoes.length; i++) {
            cotacoes[i] = (i+1) * dollar;
        }

        System.out.println("Dollar\tTX\tReal");
        for (int i = 0 ; i < cotacoes.length; i++) {
            System.out.print(dollar + "\t" + (i+1) + "\t" + cotacoes[i] + "\n");
        }
        
        scan.close();
    }
}
