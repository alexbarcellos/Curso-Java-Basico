import java.util.Scanner;

public class ex01_maiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEntre com um número: ");
        int numero1 = scan.nextInt();
        System.out.print("\nEntre com outro número: ");
        int numero2 = scan.nextInt();
        
        int maior;
        if ( numero1 > numero2 ) {
            maior = numero1;
        } else {
            maior = numero2;
        }
        System.out.println("O maior número deles é o " + maior);
        scan.close();
    }
}
