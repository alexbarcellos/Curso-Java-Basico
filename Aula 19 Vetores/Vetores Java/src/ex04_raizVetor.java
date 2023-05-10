import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04_raizVetor {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.##"); // formatar para 2 casas decimais

        Scanner scan = new Scanner(System.in);
        double[] vetA = new double[5];
        double[] vetB = new double[vetA.length];
        String msgA = "Vetor A (Entrada)      : "; // (utilizando outputs pa-
        String msgB = "Vetor B (Raiz Quadrada): "; //  ra mensagens de saída)
        
        for ( int i=0 ; i<vetA.length ; i++) {
            System.out.print((i+1) + "ª posicao do vetor: ");
            vetA[i] = scan.nextDouble();
            vetB[i] = Math.sqrt(vetA[i]);
            msgA += format.format(vetA[i]) + "\t";
            msgB += format.format(vetB[i]) + "\t";
        }
        System.out.println("\n" + msgA);
        System.out.println(msgB + "\n");
        scan.close();
    }
}
