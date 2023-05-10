import java.util.Scanner;

public class ex12_totalizaVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;

        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.print((i+1) + "º Valor: " );
            vetor[i] = scan.nextInt();
            soma += vetor[i];
        }
        System.out.println("\nTotal armazenado no vetor: " + soma);
        scan.close();
    }
}