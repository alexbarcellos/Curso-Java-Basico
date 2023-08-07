public class Contato {
    private int id;
    private String nome;
    private String telefone;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void adicionarContato(String nome, String telefone, int contador) {
        setId(contador);
        this.nome = nome;
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "id: " + id + "  Nome: " + nome + " | Telefone: " + telefone;
    }
}