public class Lampada {

    //////////////////////////////////// ATRIBUTOS /////////////////////////////

    private String modelo;
    private int tensao;
    private String cor;
    private String tipoLuz;
    private int potencia;
    private int garantiaMeses;
    private String[] tipos;
    private double preço;
    private boolean ligada;

    //////////////////////////////////// CONSTRUTORES /////////////////////////////

    public Lampada() {
    }

    public Lampada(String modelo, int tensao, String cor, String tipoLuz, int potencia, int garantiaMeses,
            double preço, boolean ligada, String[] tipos) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.potencia = potencia;
        this.garantiaMeses = garantiaMeses;
        this.tipos = new String[2];
        this.preço = preço;
        this.ligada = ligada;
    }

    ///////////////////////////// GETTER & SETTERS ////////////////////////////

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getTensao() {
        return this.tensao;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isLigada() {
        return ligada;
    }

    //////////////////////////////////// METODOS ////////////////////////////////////

    public void mostrarCaracteristicas() {
        System.out.println();
        System.out.println(this.modelo);
        System.out.println(this.tensao);
        System.out.println(this.cor);
        System.out.println(this.potencia);
        System.out.println(this.preço);
        System.out.println(this.garantiaMeses);
        System.out.println(this.tipoLuz);
        tipos = new String[2];
        System.out.println(this.tipos);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("Ligada");
        } else {
            System.out.println("Desligada");
        }
    }

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public boolean mudarEstado() {
        if (ligada) {
            return this.ligada = false;
        } else {
            return this.ligada = true;
        }
    }
}
