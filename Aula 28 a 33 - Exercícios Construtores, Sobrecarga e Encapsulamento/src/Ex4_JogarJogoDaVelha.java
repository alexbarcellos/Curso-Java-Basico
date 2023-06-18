import java.util.Scanner;

public class Ex4_JogarJogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
                
        System.out.println("\nJogo da Velha - Novo Jogo");
        jogo.exibirTabuleiro();

        while (!jogo.ganhou(jogo.getPlayer())) {
            jogo.jogadorDaVez();
            System.out.print(" Jogador " + jogo.getPlayer() + " - Posição: ");
            jogo.escolherPosicao(scan.nextLine().charAt(0));
            jogo.exibirTabuleiro();
        }

        scan.close();
    }
}
