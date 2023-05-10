import java.util.Scanner;

public class ex11_paresNoVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vA = new int[10];
        int par = 0;


        for (int i = 0 ; i<vA.length ; i++ ) {
            System.out.print("Valor " + i + ":  ");
            vA[i] = scan.nextInt();

            if (vA[i] % 2 == 0) {
                par += 1;
            }
        }

        if (par > 1) { // tratando o plural e singular na saída
            System.out.println("\n" + par + " pares. \n");
        } else if ( par == 0 ) {
            System.out.println("\nNenhum par! \n");
        } else {
            System.out.println("\nSó " + par + " par. \n");
        }

        scan.close();
    }
}