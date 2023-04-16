import java.util.Scanner;

public class ex07_maiorEmenorDaSequencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEntre com um número: ");
        int numero1 = scan.nextInt();
        System.out.print("Entre com outro número: ");
        int numero2 = scan.nextInt();
        System.out.print("Entre com mais outro número: ");
        int numero3 = scan.nextInt();
        
        int maior; // O bloco abaixo verifica o maior dos 3 numeros
        if ( (numero1 >= numero2) && (numero1 > numero3) ) {
            maior = numero1;
        } else {
            if ( (numero2 >= numero1) && (numero2 > numero3)) {
                maior = numero2;
            } else {
                maior = numero3;
            }
        }
        int menor;  // O bloco abaixo verifica o menor dos 3 numeros
        if ( (numero1 <= numero2) && (numero1 < numero3) ) {
            menor = numero1;
        } else {
            if ( (numero2 <= numero1) && (numero2 < numero3)) {
                menor = numero2;
            } else {
                menor = numero3;
            }
        }
        System.out.println("O menor número deles é o " + menor);
        System.out.println("O maior número deles é o " + maior);
        scan.close();
    }
}