import java.util.Scanner;

public class ex26_fatorialFormatado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nQual o Fatorial: ");
        int numero = scan.nextInt();
        int fatorial=1;
        System.out.print("Fatorial de " + numero + "!  =  ");
        for (int i=numero ; i > 1 ; i-- ) {
            fatorial *=i;
            System.out.print(i + " . ");
        }
        System.out.println("1 = " + fatorial);
        scan.close();
    }    
}