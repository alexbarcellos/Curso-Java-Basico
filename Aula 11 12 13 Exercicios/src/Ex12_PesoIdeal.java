import java.util.Scanner;

public class Ex12_PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.print("\nQual sua altura? ");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal + "\n");
        scan.close();
    }
}
