import java.util.Scanner;

public class ex24_vetorPalindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] palindromos = new int[6];
        String msg = "";

        for (int i = 0; i < palindromos.length; i++) {
            System.out.print("Digite o número na posição " + i + ":  ");
            palindromos[i] = scan.nextInt();
        }
        
        for( int i = 0, j = palindromos.length - 1 ; i < palindromos.length / 2 ; i++, j--) { // a verificação só precisa ir até a metade do vetor (vetor/2)

            if ( palindromos[i] != palindromos[j]) {
                msg = "Vetor não é Palindromo";
                break;
            } else {
                msg = "Vetor é Palindromo";
            }
        }

        System.out.println(msg);
        scan.close();
    }
}