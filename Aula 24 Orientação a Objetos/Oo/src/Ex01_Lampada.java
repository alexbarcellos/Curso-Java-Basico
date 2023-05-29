
public class Ex01_Lampada {
    public static void main (String[] args) {
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
        
        System.out.println("============================");
        
        System.out.println(lamp.tipos[2] + " de " + lamp.potencia + "w");
    }
}