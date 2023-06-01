public class Ex1_LigarLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.ligar();
        lampada.verEstado();
        lampada.desligar();
        lampada.verEstado();
        lampada.mudarEstado();
        lampada.verEstado();
    }
}
