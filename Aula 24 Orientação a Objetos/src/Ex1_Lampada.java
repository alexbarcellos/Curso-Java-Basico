public class Ex1_Lampada {
    public static void main(String[] args) throws Exception {
        Lampada lamp = new Lampada();
        lamp.cor = "Branca";
        lamp.modelo = "LUZ10";
        lamp.garantiaMeses = 12;
        lamp.potencia = 100;
        lamp.preço = 12.05;
        lamp.tensao = 110;
        lamp.tipoLuz = "Abajour";
        lamp.tipos = new String[3];
        lamp.tipos[0] = "Incandescente";
        lamp.tipos[1] = "Fluorescente";
        lamp.tipos[2] = "Led";

        System.out.printf("\nA lâmpada %s custa R$ %.2f", lamp.tipos[2], lamp.preço);
        System.out.printf("\nA lâmpada %s opera em  %d volts", lamp.tipos[0], lamp.tensao);
        System.out.printf("\nA lâmpada %s tem %dW", lamp.tipos[1], lamp.potencia);
    }
}