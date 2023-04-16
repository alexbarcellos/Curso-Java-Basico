import java.util.Scanner;

public class ex12_holerite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o valor da Hora trabalhada:    ");
        double horas = scan.nextDouble();
        System.out.print("\bDigite o número de Horas trabalhadas: ");
        double valorHora = scan.nextDouble();
        double salarioBruto = valorHora * horas;

        double percentualIr;
        if (salarioBruto > 2500) {
            percentualIr = 0.20;
        } else if (salarioBruto <= 900) { 
            percentualIr  =  0;
        } else if (salarioBruto <= 1500) {
            percentualIr = 0.05;
        } else { // entre 1501 a 2500
            percentualIr = 0.10;
        }
        double ir = percentualIr * salarioBruto;
        double sindicato = salarioBruto * 0.03;
        double inss = salarioBruto* 0.10;
        double descontos = ir + sindicato + inss;
        double fgts = salarioBruto * 0.11;
        double liquido = salarioBruto - descontos;

        System.out.println("\nSalario Bruto ( " + valorHora + " * " + horas +" ) = " + salarioBruto);
        System.out.println("Imposto de Renda (" + (percentualIr*100) + "%)  -" + ir);
        System.out.println("Sindicato ( 3% )          -" + sindicato);
        System.out.println("INSS ( 10% )              -" + inss);
        System.out.println("TOTAL DE DESCONTOS        -" + descontos);
        System.out.println("\nFGTS (11% não descontado ) " + fgts);
        System.out.println("\nSalário Líquido            " + liquido);
        System.out.println("\n");
        scan.close();
    }
}
