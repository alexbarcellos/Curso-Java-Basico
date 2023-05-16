import java.util.Scanner;

public class ex23_apenasPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] apenasPares = new int[10];

        for (int i =0 ; i < apenasPares.length ; i++) {
            System.out.print("Digite o número: ");
            apenasPares[i] = scan.nextInt();

            if ( apenasPares[i] % 2 != 0 ) {
                System.out.println("Apenas " + i + " são pares");
                break;
            } else if (i+1 == apenasPares.length) {
                System.out.println("Todos são pares !!!");
            }
        }

        scan.close();
    }
}
