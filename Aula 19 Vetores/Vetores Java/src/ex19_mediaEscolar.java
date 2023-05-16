import java.util.Scanner;

public class ex19_mediaEscolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] result = new double[10];
        double[] notas1 = new double[result.length];
        double[] notas2 = new double[result.length];
        String sit = "";
        String msg = "\nRESULTADO FINAL\n";
                msg += "ALUNOS: \tN1:\t N2:\tMEDIA\tSITUAÇÃO\n";

        System.out.println("\nEntre com as 2 notas dos alunos");
        System.out.println("ALUNOS:   \tN1: \tN2:");

        for (int i = 0 ; i < result.length ; i++) {
            System.out.print("Aluno " + (i+1) + ":  \t");
            notas1[i] = scan.nextDouble();
            notas2[i] = scan.nextDouble();
            result[i] = (notas1[i] + notas2[i]) / 2;
            
            if (result[i] < 7) {
                sit = "Reprovado";
            } else {
                sit = "Aprovado!";
            }
            msg += "Aluno " + (i+1) + "  \t" + notas1[i] + "\t " + notas2[i] + "\t" + result[i] + "\t" + sit + "\n";
        }

        System.out.println(msg + "\n");
        scan.close();
    }
}