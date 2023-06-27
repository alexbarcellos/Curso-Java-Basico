public class Agenda {
    private static String nomeAgenda;
    private static Contato[] contatos;

    public Agenda() {
    }

    public static String getNomeAgenda() {
        return nomeAgenda;
    }

    public static void setNomeAgenda(String nomeAgenda) {
        Agenda.nomeAgenda = nomeAgenda;
    }

    public static Contato[] getContatos() {
        return contatos;
    }

    public static void setContatos(Contato[] contatos) {
        Agenda.contatos = contatos;
    }

    public static void exibirAgenda() {
        
        System.out.println(Agenda.getNomeAgenda());

        for (Contato c : contatos) {
            System.out.println(c.getNome());
            System.out.println(c.getTelefone());
            System.out.println(c.getEmail());
            System.out.println();
        }
    }
    
}
