import java.util.Scanner;

public class ex03_quadradoDoVetor {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vecA = new int[15];
        int[] vecB = new int[vecA.length];

        for (int i=0 ; i < vecA.length ; i++) {
            System.out.print("Posição "+ i +" : ");

            vecA[i] = scan.nextInt();
            vecB[i] = vecA[i] * vecA[i];
        }

        System.out.print("Vetor A ^ 2  =  Vetor B: ");
        for (int i=0 ; i < vecB.length ; i++) {
            System.out.print(vecB[i]+"   ");
        }
        scan.close();
    }
}