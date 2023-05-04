import java.util.Scanner;

public class ex29_sequenciaDePrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o ultimo número da sequencia: "); // 3
        int ultimo = scan.nextInt();
        boolean primo;
        System.out.print("Primos: ");
        
        for ( int n = 1 ; n <= ultimo ; n++ ) {

            primo = true;
            for ( int i = 2 ; i < n ; i++) {
                if ( n % i == 0 ) {
                   primo = false;
                } 
            }

            if (primo) {
                System.out.print(n + "   ");
            }
        }
        scan.close();
    }
}