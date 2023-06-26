import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre o número: ");
        int fat = Fatorial.fatorial(scan.nextInt());
        System.out.println(fat);

        scan.close();
    }
}
