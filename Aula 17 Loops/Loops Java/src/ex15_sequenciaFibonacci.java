import java.util.Scanner;

public class ex15_sequenciaFibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEntre com o n-ésimo termo da Sequencia de Fibonacci: ");
        int termo = scan.nextInt();
        int ant = 1;
        int prox = 2;
        int seq = ant+prox;
        System.out.print("\nSequencia de Fibonacci: 1 2");

        for (int i=0 ; i<termo ; i++) {
            seq = ant + prox;
            System.out.print(" " + seq);
            ant = prox;
            prox = seq;
        }
        scan.close();
    }
}
