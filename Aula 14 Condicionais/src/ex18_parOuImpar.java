import java.util.Scanner;

public class ex18_parOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com um número inteiro: ");
        int numero = scan.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }
        scan.close();
    }
}