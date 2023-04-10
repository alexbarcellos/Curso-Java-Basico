import java.util.Scanner;

public class Ex05_ConversorMetrico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nQual a metragem: ");
        Double metros = scan.nextDouble();

        Double centimetros = (metros*100);
        System.out.println("Em Centímetros fica: " + centimetros + "\n");

        scan.close();
    }
}