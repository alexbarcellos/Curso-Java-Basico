import java.util.Scanner;

public class ex05_mediaEscolar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a segunda  nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;
        if (media == 10) {
            System.out.println("Aprovado com distição !!!");
        } else {
            if (media >= 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("REPROVADO...");
            }
        }
        scan.close();
    }
}