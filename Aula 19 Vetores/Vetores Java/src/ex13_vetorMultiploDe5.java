import java.util.Scanner;
public class ex13_vetorMultiploDe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int [15];
        int add = 0;

        System.out.println("\nEntre com os valores do Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.nextInt();  
            if (vetor[i] % 5 == 0) {
                add++;
            }  
        }
        System.out.println("\nTotal de multipos de 5 nesse vetor: " + add);
        scan.close();
    }
}