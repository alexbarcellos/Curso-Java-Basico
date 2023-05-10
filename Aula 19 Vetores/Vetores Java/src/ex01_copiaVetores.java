import java.util.Scanner;

public class ex01_copiaVetores {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i=0 ; i < vetorA.length ; i++) {

            System.out.print("Valor na posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A: ");
        for ( int valor : vetorA) {
            System.out.print(valor + " ");
        }

        System.out.print("\nVetor B: ");
        for ( int valor : vetorB) {
            System.out.print(valor + " ");
        }
        scan.close();
    }
}