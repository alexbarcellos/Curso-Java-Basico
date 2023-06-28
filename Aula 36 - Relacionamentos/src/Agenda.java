public class Agenda {
    private static String nome;
    private static Contato[] contatos;

    public Agenda() {
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nomeAgenda) {
        Agenda.nome = nomeAgenda;
    }

    public static Contato[] getContatos() {
        return contatos;
    }

    public static void setContatos(Contato[] contatos) {
        Agenda.contatos = contatos;
    }

    public static void exibirAgenda() {

        if (Agenda.getNome() != null) {
            System.out.println(Agenda.getNome()); // exibe o nome da agenda

            for (Contato contato : contatos) {
                if (contato != null) {
                    System.out.println(contato.exibirContato()); // exibe os 3 contatos
                }

            }
        }

    }

}
