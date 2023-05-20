import java.util.Scanner;

public class ex03_qtdParesImpares {
    public static void main(String[] args) {
        int[][] valores = new int [3][3];
        Scanner scan    = new Scanner(System.in);
        int qtdImpares = 0;
        int qtdPares   = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valores da Linha " + i);
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + "\t");

                if (valores[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
            System.out.println();
        }

        System.out.println(qtdPares + " pares.");
        System.out.println(qtdImpares + " impares.");
    }
}