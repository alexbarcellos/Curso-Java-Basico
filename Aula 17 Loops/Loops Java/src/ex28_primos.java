import java.util.Scanner;

public class ex28_primos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        boolean primo = true;
        for ( int i = 2 ; i < numero ; i++) {
            if ( numero % i == 0 ) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não é Primo");
        }
        scan.close();
    }
}