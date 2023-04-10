import java.util.Scanner;

public class Ex07_AreaQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nQual o LADO do Quadrado: ");
        Double lado = input.nextDouble();
        System.out.println("\nO Dobro da área do Quadrado será: " + (2*lado*lado));
        input.close();
    }
}