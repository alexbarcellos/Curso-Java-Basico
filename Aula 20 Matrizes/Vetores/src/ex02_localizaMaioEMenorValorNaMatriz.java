import java.util.Random;

public class ex02_localizaMaioEMenorValorNaMatriz {
    public static void main(String[] args) {
        int[][] matrizValores = new int[10][10];
        int[][] resultadoPesquisa = new int[2][2];
        Random rnd = new Random();
        
        for (int i = 0; i < matrizValores.length; i++) { // atribuindo valores aleatórios na Matriz
            for (int j = 0; j < matrizValores[i].length; j++) {
                matrizValores[i][j] = rnd.nextInt(10); // aleatórios inteiros ate 10 
            }
        }

        for (int i = 0; i < matrizValores.length; i++) { 
            for (int j = 0; j < matrizValores[i].length; j++) {
                System.out.print(matrizValores[i][j] + "\t");
            }
            System.out.println();
        }

        
        int lin = 5;  // pesquisando valores da linha 5
        int maior  = Integer.MIN_VALUE;
        int menor  = Integer.MAX_VALUE; 
        for (int j = 0; j < matrizValores[lin].length; j++) {
            
            if ( matrizValores[lin][j] > maior ) {
                maior = matrizValores[lin][j];
            }
            if ( matrizValores[lin][j] < menor ) {
                menor = matrizValores[lin][j];
            }
        }
        resultadoPesquisa[0][0] = maior;
        resultadoPesquisa[0][1] = menor;

        int col = 7;  // pesquisando valores da coluna 7
        maior  = Integer.MIN_VALUE;
        menor  = Integer.MAX_VALUE;

        for (int i = 0; i < matrizValores[col].length; i++) {
            
            if ( matrizValores[i][col] > maior ) {
                maior = matrizValores[i][col];
            }
            if ( matrizValores[i][col] < menor ) {
                menor = matrizValores[i][col];
            }
        }
        resultadoPesquisa[1][0] = maior;
        resultadoPesquisa[1][1] = menor;

        System.out.println("\nMaior da Linha " + lin + ": " + resultadoPesquisa[0][0]);
        System.out.println("Menor da Linha " + lin + ": " + resultadoPesquisa[0][1]);

        System.out.println("Maior da Coluna " + col + ": " + resultadoPesquisa[1][0]);
        System.out.println("Menor da Coluna " + col + ": " + resultadoPesquisa[1][1]);
        
    }
}
