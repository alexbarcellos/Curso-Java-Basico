import java.util.Scanner;

public class Ex06_AreaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nRaio do Círculo: ");
        Double raio = scan.nextDouble();
        System.out.println("\nA área do Cículo é: "+(raio*raio * (3.1515))+"\n");
        scan.close();
    }
}
