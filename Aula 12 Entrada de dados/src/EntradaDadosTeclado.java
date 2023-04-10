import java.util.Scanner;

public class EntradaDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        
        System.out.println("Digite o primeiro nome: ");
        String primeiroNome = scan.nextLine();
        
        System.out.println("Digite seu nome: ");
        String nomeTodo = scan.nextLine();

        System.out.println("Seu Primeiro nome é : " + primeiroNome);
        System.out.println("Seu nome completo é : " + nomeTodo);
        System.out.println("Sua idade: " + idade);
        scan.close();
    } 
}