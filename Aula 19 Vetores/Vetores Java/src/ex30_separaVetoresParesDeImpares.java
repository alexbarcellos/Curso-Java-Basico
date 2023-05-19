import java.util.Scanner;

public class ex30_separaVetoresParesDeImpares {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorNumeros = new int[20];
        int par = 0;
        int impar = 0;

        System.out.println("\nDigite os números:");

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorNumeros[i] = scan.nextInt();

            if (vetorNumeros[i] %2 ==0) {
                par++;
            } else {
                impar++;
            }
        }

        // Criando vetores Par e Impar com tamanhos dinâmicos: //

        int[] vetorImpar = new int[impar];
        int[] vetorPar = new int[par];
        par = 0;
        impar = 0;

        for (int i = 0; i < vetorNumeros.length; i++) {

            if (vetorNumeros[i] %2 == 0) {
                vetorPar[par] = vetorNumeros[i];
                par++;
            } else {
                vetorImpar[impar] = vetorNumeros[i];
                impar++;
            }
        }

        System.out.println("\nVetor Par: ");
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.print(vetorPar[i] + " ");
        }

        System.out.println("\nVetor Impar: ");
        for (int i = 0; i < vetorImpar.length; i++) {
            System.out.print(vetorImpar[i] + " ");
        }

        scan.close();
    }
}