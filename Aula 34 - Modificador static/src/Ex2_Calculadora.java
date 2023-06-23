import java.util.Scanner;

public class Ex2_Calculadora {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com  um   número: ");
        a = scan.nextInt();
        System.out.print("Entre com outro número: ");
        b = scan.nextInt();

        imprimir(Calculadora.somar(a, b));
        imprimir(Calculadora.subtrair(a, b));
        imprimir(Calculadora.multiplicar(a, b));
        imprimir(Calculadora.dividir(a, b));
        imprimir(Calculadora.potencia(a, b));

    }

    public static void imprimir(double resultado) {
        System.out.println(resultado);
    }
}