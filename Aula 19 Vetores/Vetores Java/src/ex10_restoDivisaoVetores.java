import java.util.Scanner;

public class ex10_restoDivisaoVetores {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] vctA = new int[5];
        int[] vctB = new int[vctA.length];

        for (int i = 0 ; i<vctA.length ; i ++) {
            System.out.print("Vetor A, Posição " + i + ":  ");
            vctA[i] = scan.nextInt();
            vctB[i] = vctA[i] % 2;
        }

        System.out.println("\nVetor B, Restos da divisão por 2:");
        for (int i = 0 ; i<vctA.length ; i ++) { // ( int i : vctB) {
            System.out.print(vctB[i] + " ");
        }

        scan.close();
    }
}