public class Agenda {
    private Contato[] contatos;
    
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() { //exibe toda agenda
        String info = "";
        for (Contato c : contatos) {
            info += "\nid: " + c.getId() + "  Nome: " + c.getNome() + " | Telefone: " + c.getTelefone();
        }
        return info;
    }

    public Contato consultarNome(String nome) {

        for (Contato c : contatos) {

            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }
}