import java.util.Scanner;

public class Ex1_FibonacciRecursivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos termos: ");
        int nTermo = Fibonacci.sequencia(scan.nextInt());
        System.out.println(nTermo);
        scan.close();
    } 
}
