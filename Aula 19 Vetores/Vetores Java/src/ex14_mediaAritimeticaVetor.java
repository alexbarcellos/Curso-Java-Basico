import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14_mediaAritimeticaVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("##.##");
        double[] vetorMedias = new double[8];
        double soma = 0;
        int notasImpares = 0;
        String msg = "\nSomente notas IMPARES:  (  ";

        System.out.println("Digite as notas:");
        for (int i = 0 ; i < vetorMedias.length; i++) {
            vetorMedias[i] = scan.nextDouble();
            
            if (vetorMedias[i] % 2 == 1) {
                soma += vetorMedias[i];
                notasImpares++;
                msg += vetorMedias[i] + "  ";
            }
        } 
        
        if (soma > 0 ) { 
            System.out.println(msg + ")");
            System.out.print("\nMédia Aritmética Simples " + fmt.format(soma/notasImpares));
        } else {  
            System.out.println("Sem notas Impares. Nada a calcular");
        }
        scan.close();
    }
}