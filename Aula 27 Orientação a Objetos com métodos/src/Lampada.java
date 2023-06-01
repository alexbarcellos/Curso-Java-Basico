public class Lampada {
    String modelo;
    int tensao;
    String cor;
    String tipoLuz;
    int potencia;
    int garantiaMeses;
    String[] tipos;
    double preço;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void verEstado() {
        if (ligada) {
            System.out.println("LIGADA");
        } else {
            System.out.println("desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

}