import java.util.Scanner;

public class ex14_contaParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par = 0;
        int impar = 0;

        for (int i = 1 ; i <=10 ; i++) {
            System.out.print("Entre o " + i +"º numero: ");
            int numero = scan.nextInt();

            if ( numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println(impar + "\n números Impares.\n" + par + " números Pares.");
        scan.close();
    }
}
