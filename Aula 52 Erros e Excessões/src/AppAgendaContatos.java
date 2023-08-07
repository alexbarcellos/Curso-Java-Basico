import java.util.Scanner;

public class AppAgendaContatos {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        Agenda agenda = new Agenda();
        String nome = " ";
        String telefone;

        System.out.println("AGENDA DE CONTATOS\n");

        // CADASTRAR 3 CONTATOS        
        System.out.println("Entre com os dados do contato:");
        Contato[] contatos = new Contato[3];

        try {
            for (int i = 0; i <= contatos.length; i++) { //forçando estouro do array. não deveria ser '<=' só '='
                Contato c = new Contato();
                System.out.print("Nome: ");
                nome = scan.nextLine();
    
                if (nome.equals("")) {
                    System.exit(0);
                }
    
                System.out.print("Telefone: ");
                telefone = scan.nextLine();
    
                contador++;
                c.adicionarContato(nome, telefone, contador);
                contatos[i] = c;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("estourou o array... \nignorando o ultimo cadastro\nErro: " + e);
        }

        agenda.setContatos(contatos);

        // MOSTRAR TODOS CONTATOS
        System.out.println(agenda.toString());

        // CONSULTAR CONTATOS
        System.out.print("\nQual contato deseja exibir: ");
        Contato contatoNome = agenda.consultarNome(scan.next());
        
        try {
            System.out.println(contatoNome.toString());
        } catch (Exception e) {
            System.out.println("Contato não existe");
            System.out.println("Erro encontrado: " + e);
        }

        scan.close();
    }
}