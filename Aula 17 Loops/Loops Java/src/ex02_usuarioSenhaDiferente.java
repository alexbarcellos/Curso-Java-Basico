import java.util.Scanner;

public class ex02_usuarioSenhaDiferente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        String user;
        String pass;
        while (flag) {
            System.out.print("\nUsuário: ");
            user = scan.nextLine();
            System.out.print("Senha: ");
            pass = scan.nextLine();
            if ( !(user.equals(pass)) ) { // usei o operador  '!'  (not) 
                flag = false;
                System.out.println("Usuários e Senhas aceitos! ");
            } else {
                System.out.println("Usuários e Senhas não podem ser iguais... ");
            }
        }
        scan.close();
    }
}