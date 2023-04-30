import java.util.Scanner;

public class ex08_mediaAritimetica {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        for ( int i = 1 ; i <=5 ; i++ ) {
            System.out.print("Entre com o " + i + "º número:  ");
            double numero = scan.nextDouble();
            soma += numero;
        }
        System.out.print("Média: " + soma/5);
        scan.close();
    }
}
