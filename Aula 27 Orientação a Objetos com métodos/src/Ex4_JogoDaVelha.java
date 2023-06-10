import java.util.Scanner;

public class Ex4_JogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();

        jogo.exibirTabuleiro();

        while (!jogo.ganhou()) {
            jogo.escolherJogadorDaPartida();
            jogo.escolherPosicao();
            jogo.exibirTabuleiro();
            
        }
        
        scan.close();
    }
}