import java.util.Scanner;

public class Ex02_ExibeNumeroDigitado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o número: ");
        int numero = scan.nextInt();
        System.out.println("O número Digitado foi: " + numero + "\n");
        scan.close();
    }
    
}
