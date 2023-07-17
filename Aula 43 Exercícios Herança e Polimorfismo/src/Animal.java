public class Animal {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;


    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    @Override
    public String toString() {
        String info = "\nAnimal: " + this.nome;
        info += String.format("\nComprimento: %.02fm", this.comprimento);
        info += "\nPatas: " + patas;
        info += "\nCor: " + this.cor;
        info += "\nAmbiente: " + ambiente;
        info += String.format("\nVelocidade: %.01fKm/h", this.velocidade);
        return info;
    }

}
