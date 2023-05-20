import java.util.Random;

public class ex01_maiorValorNaMatriz {
    public static void main(String[] args) {
        int [][] matrizAleatoria = new int [4][4];
        Random numAleatorio = new Random(); // gera numeros aleatórios
        int maior = 0;
        int lin   = 0;
        int col   = 0;

        for (int i = 0; i < matrizAleatoria.length; i++) { // atribuindo valores aleatórios na Matriz
            for (int j = 0 ; j < matrizAleatoria[i].length ; j++) {

                matrizAleatoria[i][j] = numAleatorio.nextInt(100); // aleatórios inteiros ate 100 
            }
        }
        for (int i = 0; i < matrizAleatoria.length; i++) {
            
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                System.out.print(matrizAleatoria[i][j] + "\t");
                if (matrizAleatoria[i][j] > maior) {
                    maior = matrizAleatoria[i][j];
                    lin = i;
                    col = j;
                }
            }
            System.out.println("\n");
        }

        System.out.println("Maior: " + maior +  "\nLinha: " + lin + "\nColuna: " + col);
    }
}