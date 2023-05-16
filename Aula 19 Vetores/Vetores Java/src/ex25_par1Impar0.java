import java.util.Scanner;

public class ex25_par1Impar0 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetorNumeros = new int[10];
        int [] vetorBinarios = new int[vetorNumeros.length];

        for (int i = 0 ; i < vetorNumeros.length ; i++ ) {
            System.out.print("Entre com um valor qualquer: ");
            vetorNumeros[i] = scan.nextInt();

            vetorBinarios[i] = (vetorNumeros[i] % 2 == 0) ? 1 : 0 ; // Operador Ternário
            /*
            if ( vetorNumeros[i] % 2 == 0 ) {
                vetorBinarios[i] = 0;
            } else {
                vetorBinarios[i] = 1;
            } 
            */
        }

        System.out.print("\nVetor de Números: ");
        for (int i = 0 ; i < vetorNumeros.length ; i++ ) {
            System.out.print(vetorNumeros[i] + " ");
        }

        System.out.print("\nVetor de Binários: ");
        for (int i = 0 ; i < vetorBinarios.length ; i++ ) {
            System.out.print(vetorBinarios[i] + " ");
        }

        scan.close();
    }
}