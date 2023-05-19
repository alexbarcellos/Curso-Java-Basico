import java.util.Scanner;

public class ex34_analiseParesAteNumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        String msg;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scan.nextInt();
        }

        for (int i = 0 ; i <= numeros.length ; i++) { 
            System.out.println("\nAnalizando o nº " + numeros[i]);

            for (int j = 0 ; j <= numeros[i] ; j++) {

                if (j % 2 == 0) {
                    msg = " Par ";
                } else {
                    msg = " Impar ";
                }

                System.out.println(j + msg);
            }
        }

        scan.close();
    }
}