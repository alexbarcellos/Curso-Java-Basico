import java.util.Scanner;

public class ex06_maiorNumeroSequencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEntre com um número: ");
        int numero1 = scan.nextInt();
        System.out.print("Entre com outro número: ");
        int numero2 = scan.nextInt();
        System.out.print("Entre com mais outro número: ");
        int numero3 = scan.nextInt();
        
        int maior;
        if ( (numero1 >= numero2) && (numero1 > numero3) ) {
            maior = numero1;
        } else {
            if ( (numero2 >= numero1) && (numero2 > numero3)) {
                maior = numero2;
            } else {
                maior = numero3;
            }
        }
        System.out.println("\nO maior número deles é o " + maior);
        scan.close();
    }
}

