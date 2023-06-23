public class Calculadora {

    public static int somar(int a, int b) {
        return (a + b);
    }

    public static int subtrair(int a, int b) {
        return (a - b);
    }

    public static int multiplicar(int a, int b) {
        return (a * b);
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("O outro número não pode ser '0");
            return 999999999;
        } else {
            return (a / b);
        }
    }

    public static int potencia(double a, double b) {
        return (int) Math.pow(a, b);
    }

    public static int fatorial(int a) {
        int res = a;

        if (a == 0) {
            return 1;
        } else {
            while (a > 1) {
                res *= (--a);
            }
            return res;
        }
    }
}
