import java.util.Scanner;

public class ex14_aprovadoReprovado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nDigite a 1a. nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a 2a. nota: ");
        double nota2 = scan.nextDouble();
        
        String resultado, situacao;
        double media = ( nota1 + nota2 ) / 2;
        if (media >= 9) {
            resultado = "A";
            situacao = "Aprovado com louvor, ";
        } else if (media >= 7.5) {
            resultado = "B";
            situacao = "Aprovado";
        } else if (media >= 6) {
            resultado = "C";
            situacao = "Aprovado";
        } else if (media >= 4 ) {
            resultado = "D";
            situacao = "Reprovado";
        } else {
            resultado = "E";
            situacao = "Reprovado";
        }

        System.out.println("Sua media foi " + media);
        System.out.println("Você foi " + situacao + " com nota " + resultado);
        scan.close();
    }
}