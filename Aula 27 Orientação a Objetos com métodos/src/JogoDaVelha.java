import java.util.Scanner;

public class JogoDaVelha {
    Scanner scan = new Scanner(System.in);
    int x = 0, y = 0;
    int partida = 0;
    int posicao;
    String jogada = "";
    char player = ' ';
    char[][] tabuleiro = {
            { '1', '2', '3' },
            { '4', '5', '6' },
            { '7', '8', '9' }
    };

    public void exibirTabuleiro() {
        if (partida == 0) {
            System.out.println("\nJogo da Velha - Novo Jogo");
        } else {
            System.out.println("  Esta foi a " + partida + "ª jogada ");
        }
        atualizarJogada();
    }

    public void escolherJogadorDaPartida() {
        partida++;

        if (partida % 2 == 1) {
            player = 'X';
        } else {
            player = 'O';
        }
    }

    public void mostrarSeOcupada() {
        System.out.println(" Posição já foi ocupada");
        partida--;
    }

    public boolean ganhou() {
        if (tabuleiro[0][0] == player && tabuleiro[0][1] == player && tabuleiro[0][2] == player) { // LIN 1
            mostrarGanhador("Linha 1");
            return true;
        } else if (tabuleiro[1][0] == player && tabuleiro[1][1] == player && tabuleiro[1][2] == player) { // LIN 2
            mostrarGanhador("Linha 2");
            return true;
        } else if (tabuleiro[2][0] == player && tabuleiro[2][1] == player && tabuleiro[2][2] == player) { // LIN 3
            mostrarGanhador("Linha 3");
            return true;
        } else if (tabuleiro[0][0] == player && tabuleiro[1][0] == player && tabuleiro[2][0] == player) { // COL 1
            mostrarGanhador("Coluna 1");
            return true;
        } else if (tabuleiro[0][1] == player && tabuleiro[1][1] == player && tabuleiro[2][1] == player) { // COL 2
            mostrarGanhador("Coluna 2");
            return true;
        } else if (tabuleiro[0][2] == player && tabuleiro[1][2] == player && tabuleiro[2][2] == player) { // COL 3
            mostrarGanhador("Coluna 3");
            return true;
        } else if (tabuleiro[0][0] == player && tabuleiro[1][1] == player && tabuleiro[2][2] == player) { // DIAG \
            mostrarGanhador("Diagonal \\");
            return true;
        } else if (tabuleiro[2][0] == player && tabuleiro[1][1] == player && tabuleiro[0][2] == player) { // DIAG /
            mostrarGanhador("Diagonal /");
            return true;
        } else if (partida == 9) { // EMPATE
            exibirTabuleiro();
            System.out.println(" Não houve vencedor");
            return true;
        }
        return false;
    }

    public void mostrarGanhador(String sequencia) {
        exibirTabuleiro();
        System.out.println("O Jogador " + player + " ganhou a partida na " + sequencia + "\n");
        partida = 10; // força saída do loop
    }

    public void escolherPosicao() {
        System.out.print(" Jogador " + player + " - Posição: ");
        posicao = scan.nextInt();

        switch (posicao) {
            case 1:
                if (tabuleiro[x][y] == '1') {
                    tabuleiro[x][y] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;

            case 2:
                if (tabuleiro[x][y + 1] == '2') {
                    tabuleiro[x][y + 1] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;
            case 3:
                if (tabuleiro[x][y + 2] == '3') {
                    tabuleiro[x][y + 2] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;
            case 4:
                if (tabuleiro[x + 1][y] == '4') {
                    tabuleiro[x + 1][y] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;
            case 5:
                if (tabuleiro[x + 1][y + 1] == '5') {
                    tabuleiro[x + 1][y + 1] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;
            case 6:
                if (tabuleiro[x + 1][y + 2] == '6') {
                    tabuleiro[x + 1][y + 2] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;
            case 7:
                if (tabuleiro[x + 2][y] == '7') {
                    tabuleiro[x + 2][y] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;
            case 8:
                if (tabuleiro[x + 2][y + 1] == '8') {
                    tabuleiro[x + 2][y + 1] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;
            case 9:
                if (tabuleiro[x + 2][y + 2] == '9') {
                    tabuleiro[x + 2][y + 2] = player;
                } else {
                    mostrarSeOcupada();
                }
                break;
            default:
                System.out.println("inválido, entre novamente ");
                partida--;
                break;
        }
    }

    public void atualizarJogada() {
        jogada = "";
        jogada += "\n  " + tabuleiro[x][y] + " | " + tabuleiro[x][y + 1] + " | " + tabuleiro[x][y + 2];
        jogada += "\n ---|---|--- \n";
        jogada += "  " + tabuleiro[x + 1][y] + " | " + tabuleiro[x + 1][y + 1] + " | " + tabuleiro[x + 1][y + 2];
        jogada += "\n ---|---|--- \n";
        jogada += "  " + tabuleiro[x + 2][y] + " | " + tabuleiro[x + 2][y + 1] + " | " + tabuleiro[x + 2][y + 2]
                + "  \n";
        System.out.println(jogada);
    }

}