import java.util.Scanner;

public class Ex_SomatorioRecursivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      

        System.out.print("Qual número: " );
        System.out.println(Somatorio.somar(scan.nextInt()));

        scan.close();
    }
}
