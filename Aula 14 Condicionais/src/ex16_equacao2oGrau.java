import java.util.Scanner;

public class ex16_equacao2oGrau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite os valores de (a, b e c) na equação do 2º Grau:  \"ax² + bx + c = 0\"");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Esta não é uma expressão do 2ºGrau");
        } else {
            int b = scan.nextInt();
            int c = scan.nextInt();
            double delta = (Math.pow(b,2)) - (4*a*c);

            System.out.println("EQUAÇÃO: " + a + "x² + (" + b +  "x) + (" + c + ") = 0");
            System.out.println("Delta = " + delta);

            if (delta < 0) {
                System.out.println("Esta expressão do 2ºGrau não possui raizes reais");
            } else {
                double x1 = ( (-1*b + (Math.sqrt(delta))) / (2*a));
                double x2 = ( (-1*b - (Math.sqrt(delta))) / (2*a));

                if ( x1 == x2) {
                    System.out.println("x = " + x1);
                    System.out.println("Esta expressão do 2ºGrau possui apenas uma raiz");
                } else {
                    System.out.println("x' = " + x1);
                    System.out.println("x\" = " + x2);
                } 
            }
        }
        System.out.println("\n");
        scan.close();
    }
}