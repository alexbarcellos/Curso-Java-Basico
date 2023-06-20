import java.util.Scanner;

public class JogoDaVelha {
    Scanner scan = new Scanner(System.in);
    private int partida = 0;
    private char player = ' ';
    private char[][] tabuleiro = {
            { '1', '2', '3' },
            { '4', '5', '6' },
            { '7', '8', '9' }
    };

    // ********************************* Getters & Setters *********************************

    public int getPartida() {
        return partida;
    }

    public void setPartida(int partida) {
        this.partida = partida;
    }

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
        this.player = player;
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }


// ********************************** Métodos ***********************************

    public void exibirTabuleiro() {
        System.out.println(getPartida() > 0 ? "Esta foi a " + getPartida() + "ª jogada \n" : ""); // op. ternario:
                                                                                                  // evitar "0ª jogada "
        for (int x = 0; x < getTabuleiro().length; x++) {
            for (int y = 0; y < getTabuleiro()[x].length; y++) {
                System.out.print(" " + getTabuleiro()[x][y] + ((y < 2) ? " |" : "")); // op. ternario: evita caracter "|" na ultima coluna
            }
            System.out.print(x < 2 ? "\n---|---|---\n" : "\n"); // op. ternario: evita caracteres " ---| " na ultima linha                                        
        }
        System.out.println();
    }

    public void jogadorDaVez() {
        this.partida++;
        if (getPartida() % 2 == 1) { // partida par: jogador "X"; impar: jogador "O"
            setPlayer('X');
        } else {
            setPlayer('O');
        }
    }

        public boolean ganhou(char  jogador) {
        if (getTabuleiro()[0][0] == jogador && getTabuleiro()[0][1] == jogador && getTabuleiro()[0][2] == jogador) { // LIN 1
            mostrarGanhador("Linha 1");
            return true;
        } else if (getTabuleiro()[1][0] == jogador && getTabuleiro()[1][1] == jogador && getTabuleiro()[1][2] == jogador) { // LIN 2
            mostrarGanhador("Linha 2");
            return true;
        } else if (getTabuleiro()[2][0] == jogador && getTabuleiro()[2][1] == jogador && getTabuleiro()[2][2] == jogador) { // LIN 3
            mostrarGanhador("Linha 3");
            return true;
        } else if (getTabuleiro()[0][0] == jogador && getTabuleiro()[1][0] == jogador && getTabuleiro()[2][0] == jogador) { // COL 1
            mostrarGanhador("Coluna 1");
            return true;
        } else if (getTabuleiro()[0][1] == jogador && getTabuleiro()[1][1] == jogador && getTabuleiro()[2][1] == jogador) { // COL 2
            mostrarGanhador("Coluna 2");
            return true;
        } else if (getTabuleiro()[0][2] == jogador && getTabuleiro()[1][2] == jogador && getTabuleiro()[2][2] == jogador) { // COL 3
            mostrarGanhador("Coluna 3");
            return true;
        } else if (getTabuleiro()[0][0] == jogador && getTabuleiro()[1][1] == jogador && getTabuleiro()[2][2] == jogador) { // DIAG \
            mostrarGanhador("Diagonal \\");
            return true;
        } else if (getTabuleiro()[2][0] == jogador && getTabuleiro()[1][1] == jogador && getTabuleiro()[0][2] == jogador) { // DIAG /
            mostrarGanhador("Diagonal /");
            return true;
        } else if (partida == 9) { // EMPATE
            exibirTabuleiro();
            System.out.println(" Não houve vencedor");
            return true;
        }
        return false;
    }

    private void mostrarGanhador(String sequencia) {
        exibirTabuleiro();
        System.out.println("O Jogador " + player + " ganhou a partida na " + sequencia + "\n");
        setPartida(10); // força saída do loop
    }

    public void escolherPosicao(char posicao) {

        for (int i = 0; i < getTabuleiro().length; i++) {
            for (int j = 0; j < getTabuleiro()[i].length; j++) {

                if ( isNoTabuleiro('O', i, j) || (isNoTabuleiro('X', i, j))) {
                    System.out.println("Já ocupada a Posição: " + (posicao));
                    this.partida--;
                    return;
                }
                
                if (isNoTabuleiro(posicao, i, j)) {
                    setNoTabuleiro(getPlayer(), i, j);
                    return;
                }
            }
        }   
    }
    private void setNoTabuleiro(char player2, int i, int j) {
        this.tabuleiro[i][j] = getPlayer(); //atribui o jogador atual na posicao em validação
    }

    private boolean isNoTabuleiro(char posicao, int i, int j) { // Se pos escolhida == pos do tabuleiro
        if (this.tabuleiro[i][j] == posicao) {
            return true;
        } else {
            return false;
        }
    }

}