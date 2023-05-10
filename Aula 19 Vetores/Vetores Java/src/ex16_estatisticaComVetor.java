import java.util.Scanner;
public class ex16_estatisticaComVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        int somaMenor15 = 0;
        int somaIgual15 = 0;
        int somaMediaMaior15 = 0;
        int maiores = 0;

        System.out.println("\nEntre com os elementos do vetor:");
        for (int i = 0 ; i < vetor.length; i++) {
            vetor[i] = scan.nextInt();

            if (vetor[i] < 15) {
                somaMenor15 += vetor[i];
            } else if (vetor[i] == 15) {  
                somaIgual15 ++;
            } else {
                somaMediaMaior15 += vetor[i];
                maiores++;
            }
        }
        
        System.out.println("\nQuantidade de elementos iguais a 15: " + somaIgual15);
        System.out.println("Soma do elementos menores que 15: " + somaMenor15);
        System.out.println("Média dos elementos maiores que 15: " + somaMediaMaior15 / maiores);
        scan.close();    
    }
}
