import java.util.Scanner;

public class Ex09_FahreinheitToCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nQuantos graus Farenheit: ");
        double f = scan.nextDouble();
        double c = (5 * (f-32) / 9);
        System.out.print("Convertido para Celsius será: " + c);
        scan.close();
    }
}