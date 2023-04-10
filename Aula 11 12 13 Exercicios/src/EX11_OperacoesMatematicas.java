import java.util.Scanner;

public class EX11_OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double primeiro, segundo, terceiro;

        System.out.print("\nDigite um número INTEIRO: ");
        primeiro = scan.nextInt();

        System.out.print("Digite outro número INTEIRO: ");
        segundo = scan.nextInt();

        System.out.print("Digite um número REAL: ");
        terceiro = scan.nextDouble();

        double calc1 = ((2*primeiro) * (segundo/2));
        System.out.print("\nO produto do dobro do primeiro com metade do segundo é  " + calc1 + "\n");

        double calc2 = ((3*primeiro) + (terceiro));
        System.out.print("A soma do triplo do primeiro com o terceiro é  " + calc2 + "\n");

        double calc3 = Math.pow(terceiro,3);
        System.out.println("O terceiro elevado ao cubo é  " + calc3 + "\n");

        scan.close();
    }
}
