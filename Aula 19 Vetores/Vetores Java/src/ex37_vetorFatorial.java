import java.util.Scanner;

public class ex37_vetorFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorNumeros = new int[5];
        int[] vetorFatoriais = new int[vetorNumeros.length];
        int fatorial;

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorNumeros[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorFatoriais.length; i++) {
            fatorial = 1;

            for (int j = 1; j <= vetorNumeros[i]; j++) {
                fatorial *= j; 
                vetorFatoriais[i] = fatorial;
            }
        }

        for (int i = 0; i < vetorFatoriais.length; i++) {
            System.out.println("Fatorial de " + vetorNumeros[i] + " = " + vetorFatoriais[i]);
        }
        scan.close();
    }
}