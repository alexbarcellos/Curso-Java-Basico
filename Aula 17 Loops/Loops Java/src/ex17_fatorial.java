import java.util.Scanner;

public class ex17_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nQual o Fatorial: ");
        int numero = scan.nextInt();
        int fatorial=1;
        for (int i=numero ; i > 0 ; i-- ) {
            fatorial *=i;
            System.out.print(i + " * ");
        }
        System.out.println("\b\b = " + fatorial);
        scan.close();
    }    
}
