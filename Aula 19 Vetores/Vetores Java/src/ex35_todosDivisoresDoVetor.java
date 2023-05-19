import java.util.Scanner;

public class ex35_todosDivisoresDoVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int [4];
        String msg;
            
        System.out.println("\nEntre com os valores: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scan.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("\nDIVISORES DE " + numeros[i] +": ");

            for (int j = 1; j <= numeros[i]; j++) {

                if (numeros[i] % j == 0) {
                    msg = " é divisível por "; 
                    System.out.println(numeros[i] + msg + j);
                } 
            }
        }

        scan.close();
    }
}