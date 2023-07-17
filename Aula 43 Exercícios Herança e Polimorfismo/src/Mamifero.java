public class Mamifero extends Animal {
    private String alimento;
    
    Mamifero() {
        super();
        super.setAmbiente("Terra");
        super.setPatas(4);
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlimento: " + this.alimento;
    }
    
}
