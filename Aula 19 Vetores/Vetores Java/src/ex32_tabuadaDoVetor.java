import java.util.Scanner;

public class ex32_tabuadaDoVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.print("Fazer a Tabuada do " + ": ");
            vetor[i] = scan.nextInt();
        }

        for (int i = 0 ; i < vetor.length ; i++)  {
            System.out.println("\nTABOADA DO " + vetor[i]);
            for (int j = 1; j <= 10; j++) {
                System.out.println( vetor[i] + " X " + j + " = " + (j * vetor[i]) );
            }
        }

        scan.close();
    }
}