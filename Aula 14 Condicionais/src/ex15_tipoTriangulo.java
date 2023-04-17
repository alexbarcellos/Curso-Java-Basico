import java.util.Scanner;

class ex15_tipoTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEntre com os tres lados do triangulo: ");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if ( ( (lado1 + lado2) > lado3) && ( (lado1 + lado3) > lado2 ) && ( (lado2 + lado3) > lado1 ) ) {
            // é um triangulo, o bloco abaixo verifica o tipo 
            if ( (lado1 == lado2) || (lado2 == lado3) ) {
                System.out.println("Triangulo Equilátero");
            } else if ( (lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3) ) {
                System.out.println("Triangulo Isóceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }
        } else {
            System.out.println("Não é um triangulo");
        }
        scan.close();
    }
}