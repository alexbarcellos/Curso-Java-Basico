import java.util.Scanner;

public class ex20_detetive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pista = 0;
        String resposta;
        
        System.out.println("\nDetetive - Responda S/N: ");

        System.out.print("Ligou para a vítima: ");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("s") ) {
            pista = pista + 1;
        }
        System.out.print("Esteve no local do crime: ");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("s") ) {
            pista = pista + 1;
        }
        System.out.print("Mora perto da vítima: ");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("s") ) {
            pista = pista + 1;
        }
        System.out.print("Devia para a vítima: ");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("s") ) {
            pista = pista + 1;
        }
        System.out.print("Já trabalhou para a vítima: ");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("s") ) {
            pista = pista + 1;
        }
        System.out.print("Respostas positivas: " + pista);
        switch (pista) {
            case 2:
                System.out.println(" - SUSPEITO"); break;
            case 3:
            case 4:  
                System.out.println(" - CUMPLICE"); break;
            case 5:  
                System.out.println(" - CULPADO"); break;              
            default:
            System.out.println(" - INOCENTE");  
        }
        scan.close();
    }
}
