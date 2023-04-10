import java.util.Scanner;

public class Ex03_Somar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        int numero1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = scan.nextInt();

        System.out.println("A snoma dos números foi: "+ (numero1 + numero2) + "\n");

        scan.close();
    }

}
