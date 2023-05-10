import java.util.Scanner;

public class ex07_subtraiVetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vtA = new int[4]; 
        int[] vtB = new int[vtA.length];
        int[] vtC = new int[vtA.length];
        String msgA = "\n(Entrada)   Vetor A : ";
        String msgB = "(Entrada)   Vetor B : ";
        String msgC = "(Subtração) Vetor A : ";

        System.out.println("VETOR A:");
        for (int i=0 ; i<vtA.length; i++) {
            System.out.print("Pos " + i + ":  ");
            vtA[i] = scan.nextInt();
            msgA += vtA[i] + "  ";
        }

        System.out.println("\nVETOR B:");
        for (int i=0 ; i<vtA.length; i++) {
            System.out.print("Pos " + i + ":  ");
            vtB[i] = scan.nextInt();
            vtC[i] = vtA[i] - vtB[i];
            msgB += vtB[i] + "  ";
            msgC += vtC[i] + "  ";
        }

        System.out.println(msgA);
        System.out.println(msgB);
        System.out.println(msgC + "\n");
        
        scan.close();
    }
}