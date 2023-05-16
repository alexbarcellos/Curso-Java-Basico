import java.util.Scanner;

public class ex26_vetorABC_101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        String msgA = "\nVETOR 'A':\t";
        String msgB = "VETOR 'B':\t";
        String msgC = "VETOR 'C':\t";

        System.out.println("\nVetor A");
        for (int i = 0 ; i < vetorA.length ; i++) {
            System.out.print("posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            msgA += vetorA[i] + "\t"; 
        }

        System.out.println("\nVetor B");
        for (int i = 0 ; i < vetorB.length ; i++) {
            System.out.print("posição " + i + ": ");
            vetorB[i] = scan.nextInt();
            msgB += vetorB[i] + "\t"; 
        }

        for (int i = 0 ; i < vetorA.length ; i++) {

            if (vetorA[i] > vetorB[i] ) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
            msgC += vetorC[i] + "\t"; 
        }

        System.out.println(msgA);
        System.out.println(msgB);
        System.out.println(msgC);
        
        scan.close();
    }
}