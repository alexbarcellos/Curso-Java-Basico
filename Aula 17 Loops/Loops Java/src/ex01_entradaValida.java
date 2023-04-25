import java.util.Scanner;

public class ex01_entradaValida {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int i;
        do {
            System.out.print("\nEntre com um número de 0 a 10: ");
            i = scan.nextInt();
            System.out.print("número: " + i);
            if (i < 0 || i > 10) {
                System.out.println(" Inválido");
            } else {
                System.out.println(" Válido");
            }
        } while (i < 0 || i > 10);
        scan.close();
    }
}