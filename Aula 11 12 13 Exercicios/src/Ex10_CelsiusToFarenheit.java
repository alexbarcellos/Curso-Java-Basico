import java.util.Scanner;

public class Ex10_CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nQuantos graus Celsius? ");
        double c = scan.nextDouble();
        double f = (c * 1.8) + 32;
        System.out.print("\nEm Fareinheit teremos: " + f);
        scan.close();
    }
}
