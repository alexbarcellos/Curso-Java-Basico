import java.text.DecimalFormat;
import java.util.Scanner;

public class ex31_alualizacaoSalarial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,###.##");

        System.out.print("\nAno:  1995 [Admiss] - Valor: R$ ");
        double salAntigo = scan.nextDouble();

        double aumentoProgressivo = 1.5;
        double salarioCorrigido = salAntigo * (1+(aumentoProgressivo/100));
        int anoAtual = 2015;
        
        for (int ano = 1996 ; ano <= anoAtual ; ano++) {
            
            System.out.println("Ano:  " + ano + " [+ " + aumentoProgressivo + "%] - Valor: R$ " + format.format(salarioCorrigido));
            aumentoProgressivo *= 2; // !!! Trilhonário aqui é mendigo !!!
            salarioCorrigido = salarioCorrigido * (1+(aumentoProgressivo/100));
        }
        scan.close();
    }
}
