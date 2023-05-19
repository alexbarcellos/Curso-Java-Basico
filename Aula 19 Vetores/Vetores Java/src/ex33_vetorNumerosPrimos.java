import java.util.Scanner;

public class ex33_vetorNumerosPrimos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorNumeros = new int[10];
        boolean primo = true;

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.print("número " + i + ": ");
            vetorNumeros[i] = scan.nextInt();
        }

        for (int i = 0 ; i < vetorNumeros.length ; i++) {

            for (int j = 2; j < vetorNumeros[i]; j++) {

                if (vetorNumeros[i] % j == 0) {
                    primo = false; 
                    break;
                }
            }
            
            if (primo) {
                System.out.println( vetorNumeros[i] + " - é Primo");
            } else {
                System.out.println( vetorNumeros[i] + " - não é Primo !");
            }
            primo = true;
        }

        scan.close();
    }
}