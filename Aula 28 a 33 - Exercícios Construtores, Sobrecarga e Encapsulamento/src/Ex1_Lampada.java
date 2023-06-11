public class Ex1_Lampada {
    public static void main(String[] args) throws Exception {

        Lampada lampadaFluor = new Lampada("Fluorescente20wBranca", 220, "Amarela", "Led", 110, 24, 4.55, true, null);
        lampadaFluor.mostrarCaracteristicas();
        lampadaFluor.mostrarEstado();
        
        Lampada lampadaLed = new Lampada("LED9wYellow", 110, "Branca", "Fluorescente", 9, 36, 1.99, true, null);
        lampadaLed.mostrarCaracteristicas();
        lampadaLed.setModelo("LED9wAmarela");
        lampadaLed.setTensao(220);
        lampadaLed.mostrarCaracteristicas();
        lampadaLed.setLigada(false);
        lampadaLed.mostrarEstado();
        lampadaLed.mudarEstado();
        lampadaLed.mostrarEstado();
        lampadaLed.desligar();
        lampadaLed.mostrarEstado();

    }
}
