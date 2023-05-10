import java.util.Scanner;

public class ex06_somaVetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vtA = new int[10];
        int[] vtB = new int[vtA.length];
        int[] vtC = new int[vtA.length];
        String msgA = "\nVetor A:\t";
        String msgB = "Vetor B:\t";
        String msgC = "Vetor C:\t";

        System.out.println("\nVETOR A:");
        for (int i=0 ; i< vtA.length; i++) {
            System.out.print("Posição " + i + ": ");
            vtA[i] = scan.nextInt();
            msgA += vtA[i] + "\t";
        }
        System.out.println("\nVETOR B:");
        for (int i=0; i< vtA.length ; i++) {
            System.out.print("Posição " + i + ": ");
            vtB[i] = scan.nextInt();
            vtC[i] = vtA[i] + vtB[i];
            msgB += vtB[i] + "\t"; 
            msgC += vtC[i] + "\t";
        } 

        System.out.println(msgA);
        System.out.println(msgB);
        System.out.println(msgC + "\n");
        scan.close();
    }
}