import java.util.Scanner;

public class ex31_organizaVetoresParesDeImpares {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorNumeros = new int[20];
        int[] vetorParImpar = new int[vetorNumeros.length];
        int posicaoPar = 0;
        int posicaoImpar = 0;

        System.out.println("\nDigite os números:");

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorNumeros[i] = scan.nextInt();

            if (vetorNumeros[i] %2 == 0) {
                posicaoImpar++;
            } 
        }

        for (int i = 0 ; i < vetorNumeros.length ; i++) {

            if (vetorNumeros[i] %2 == 0) {
                vetorParImpar[posicaoPar++] = vetorNumeros[i];
            } else {
                vetorParImpar[posicaoImpar++] = vetorNumeros[i];
            }
        }

        System.out.println("\nVetor Pares depois Impares: ");
        for (int i = 0 ; i < vetorNumeros.length ; i++) {
            System.out.print(vetorParImpar[i] + " ");
        }

        scan.close();
    }
}