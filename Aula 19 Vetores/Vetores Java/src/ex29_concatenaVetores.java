import java.util.Scanner;

public class ex29_concatenaVetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        System.out.println("\nDigite os vaores para o Vetor A");
        for (int i = 0 ; i < vetorA.length ; i++) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("\nDigite os vaores para o Vetor B");
        for (int i = 0 ; i < vetorA.length ; i++) {
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            
            if ( i < vetorA.length) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i-vetorA.length];
            }
        }

        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + "  ");
        }        
        scan.close();
    }
}