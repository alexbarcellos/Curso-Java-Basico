import java.util.Scanner;

public class ex02_positivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEntre com um número: ");
        int numero1 = scan.nextInt();
        
        if ( numero1 >= 0 ) {
            System.out.println("O número  é Positivo ");
        } else {
            System.out.println("O número  é Negativo ");
        }
        scan.close();
    }
}
