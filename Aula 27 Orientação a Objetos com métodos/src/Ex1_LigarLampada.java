public class Ex1_LigarLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.tipos = new String[2];
        lampada.tipos[0] = "abajour";
        lampada.tipos[1] = "LED";

        System.out.println(lampada.tipos[1]);
        
        lampada.ligar();
        lampada.verEstado();
        lampada.desligar();
        lampada.verEstado();
        lampada.mudarEstado();
        lampada.verEstado();
    }
}
