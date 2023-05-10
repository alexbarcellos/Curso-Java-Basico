import java.util.Scanner;

public class ex15_percentualParesImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        float pares = 0;
        float impares = 0;
        System.out.println("Digite os valores da amostragem:");
        for (int i = 0 ; i < vetor.length ; i++) {
            vetor[i] = scan.nextInt();

            if (vetor[i] % 2 ==0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Elementos pares:   " + pares/vetor.length*100 + "%");
        System.out.println("Elementos ímpares: " + impares/vetor.length*100 + "%");

        scan.close();
    }
}