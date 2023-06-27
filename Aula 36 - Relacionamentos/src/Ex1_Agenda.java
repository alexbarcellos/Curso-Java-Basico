import java.util.Scanner;

public class Ex1_Agenda {
    public static void main(String[] args) {
        System.out.println("\nAGENDA DE CONTADOS");
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome da Agenda: ");
        String nomeAgenda = scan.nextLine();
        Agenda.setNomeAgenda(nomeAgenda);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            Contato c = new Contato();

            System.out.print("\nNome: ");
            c.setNome(scan.nextLine());

            System.out.print("Telefone: ");
            c.setTelefone(scan.nextLine());

            System.out.print("Email: ");
            c.setEmail(scan.nextLine());

            contatos[i] = c;
        }
        Agenda.setContatos(contatos);

        Agenda.exibirAgenda();

        scan.close();
    }

    
}
