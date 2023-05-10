import java.util.Scanner;

public class ex05_vetorMultplicadoPelaPosicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[10];
        int[] vetB = new int[vetA.length];
        String msgVetA = "\nVetor A (Entrada):     ";
        String msgVetB = "\nVetor B (A * posição): ";

        for (int i=0 ; i < vetA.length ; i++) {
            System.out.print("Vetor na Posição " + i + ":  ");
            vetA[i] = scan.nextInt();
            vetB[i] = vetA[i] * i;
            msgVetA += vetA[i] + "\t";
            msgVetB += vetB[i] + "\t";
        }
        System.out.print(msgVetA);
        System.out.println(msgVetB + "\n");
        scan.close(); 
    }
}
