import java.util.Scanner;

public class Ex3_CalculadoraPlus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com  um   número: ");
        int a = scan.nextInt();

        // System.out.print("Entre com outro número: ");
        // int b = scan.nextInt();

        imprimir(Calculadora.fatorial(a));

        /*
         * imprimir(Calculadora.somar(a, b));
         * imprimir(Calculadora.subtrair(a, b));
         * imprimir(Calculadora.multiplicar(a, b));
         * imprimir(Calculadora.dividir(a, b));
         * imprimir(Calculadora.potencia(a, b));
         */
        scan.close();
    }

    public static void imprimir(int resultado) {
        System.out.println(resultado);
    }

}
