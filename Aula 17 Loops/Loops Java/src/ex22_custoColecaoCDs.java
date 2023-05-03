import java.util.Scanner;

public class ex22_custoColecaoCDs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nQuantos CDs você possui: ");
        int cds = scan.nextInt();
        double vlrCD, custoTotal = 0;

        for ( int i = 0 ; i < cds ; i++) {
            System.out.print("Custo do CD nº " + (i+1) + ": ");
            vlrCD = scan.nextDouble();
            custoTotal += vlrCD;
        }
        System.out.println("Valor total da coleção de CDs: " + custoTotal);
        System.out.println("Valor médio de cada CD: " + custoTotal / cds);
        scan.close();
    }
}
