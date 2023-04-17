import java.util.Scanner;

public class ex16_equacao2oGrau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valores de A, B e C na equação do 2º Grau:\n\rax² + bx + c = 0");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        double delta = (Math.pow(b,2)) - (4*a*c);

        double x1 = ( (-1*b + (Math.sqrt(delta))) / (2*a));
        double x2 = ( (-1*b - (Math.sqrt(delta))) / (2*a));

        //double equacao = a*(x*x) + (b*x) + (c);
        System.out.println("EQUAÇÃO: " + a + "x² + " + b +  "x + " + c + " = 0");
        System.out.println("Delta = " + delta);
        System.out.println("x' = " + x1);
        System.out.println("x\" = " + x2);
        
        scan.close();
    }
} //fazer a verificações de raizes antes de encerrar o exercício
