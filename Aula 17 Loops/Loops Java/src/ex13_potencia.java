import java.util.Scanner;

public class ex13_potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nBase da Potência: ");
        int base = scan.nextInt();
        int potencia = base;
        System.out.print("Expoente: ");
        int expo = scan.nextInt();
        for ( int i = 1 ; i < expo; i++ ) {
            potencia *= base;
        }
        System.out.println("\nPotência de " + base + " elevado a " + expo + " é " + potencia);
        scan.close();
    }
}
