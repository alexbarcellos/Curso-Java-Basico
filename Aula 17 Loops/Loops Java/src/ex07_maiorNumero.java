import java.util.Scanner;

public interface ex07_maiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        
        for (int n = 1 ; n <= 5; n++) {
            System.out.print("Entre com o " + n + "º Numero: ");
            int numero = scan.nextInt();
            if ( numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número de todos foi o " + maior);
        scan.close();
    }
}
