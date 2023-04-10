import java.util.Scanner;

public class Ex04_MediaBimestral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nNota de Março: ");
        double bimestre_1 = scan.nextDouble();
        
        System.out.print("Nota de Junho: ");
        double bimestre_2 = scan.nextDouble();
        
        System.out.print("Nota de Setembro: ");
        double bimestre_3 = scan.nextDouble();
        
        System.out.print("Nota de Dezembro: ");
        double bimestre_4 = scan.nextDouble();

        double mediaBimestral = (bimestre_1 + bimestre_2 + bimestre_3 + bimestre_4) / 4; 
        System.out.print("\nSua média Bimestral foi: " + mediaBimestral);

        scan.close();
    }
}
