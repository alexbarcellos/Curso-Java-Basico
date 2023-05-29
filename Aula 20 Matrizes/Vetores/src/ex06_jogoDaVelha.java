import java.util.Scanner;

public class ex06_jogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean joga = true;
        int x = 0, y = 0;
        int partida = 0;
        String jogada;
        char player = ' ';
        char[][] tabuleiro = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' }
        };

        jogada = ""; // Tabuleiro inicial //
        jogada += "\n  " + tabuleiro[x][y] + " | " + tabuleiro[x][y + 1] + " | " + tabuleiro[x][y + 2];
        jogada += "\n ---|---|--- \n";
        jogada += "  " + tabuleiro[x + 1][y] + " | " + tabuleiro[x + 1][y + 1] + " | " + tabuleiro[x + 1][y + 2];
        jogada += "\n ---|---|--- \n";
        jogada += "  " + tabuleiro[x + 2][y] + " | " + tabuleiro[x + 2][y + 1] + " | " + tabuleiro[x + 2][y + 2]
                + "  \n";

        while (joga) {

            System.out.println(jogada);
            partida++;

            if (partida % 2 == 1) {
                player = 'X';
            } else {
                player = 'O';
            }

            System.out.print(" Jogador " + player + " - Posição: ");
            switch (scan.nextInt()) {
                case 1:
                    if (tabuleiro[x][y] == '1') {
                        tabuleiro[x][y] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;

                case 2:
                    if (tabuleiro[x][y + 1] == '2') {
                        tabuleiro[x][y + 1] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;
                case 3:
                    if (tabuleiro[x][y + 2] == '3') {
                        tabuleiro[x][y + 2] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;
                case 4:
                    if (tabuleiro[x + 1][y] == '4') {
                        tabuleiro[x + 1][y] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;
                case 5:
                    if (tabuleiro[x + 1][y + 1] == '5') {
                        tabuleiro[x + 1][y + 1] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;
                case 6:
                    if (tabuleiro[x + 1][y + 2] == '6') {
                        tabuleiro[x + 1][y + 2] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;
                case 7:
                    if (tabuleiro[x + 2][y] == '7') {
                        tabuleiro[x + 2][y] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;
                case 8:
                    if (tabuleiro[x + 2][y + 1] == '8') {
                        tabuleiro[x + 2][y + 1] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;
                case 9:
                    if (tabuleiro[x + 2][y + 2] == '9') {
                        tabuleiro[x + 2][y + 2] = player;
                    } else {
                        System.out.println(" Posição já foi ocupada");
                        partida--;
                    }
                    break;
                default:
                    System.out.println("inválido, entre novamente ");
                    partida--;
                    break;
            }

            System.out.println("  Esta foi a " + partida + "ª jogada "); // IMPRIMINDO O TABULEIRO ATUALIZADO: //
            jogada = "";
            jogada += "\n  " + tabuleiro[x][y] + " | " + tabuleiro[x][y + 1] + " | " + tabuleiro[x][y + 2];
            jogada += "\n ---|---|--- \n";
            jogada += "  " + tabuleiro[x + 1][y] + " | " + tabuleiro[x + 1][y + 1] + " | " + tabuleiro[x + 1][y + 2];
            jogada += "\n ---|---|--- \n";
            jogada += "  " + tabuleiro[x + 2][y] + " | " + tabuleiro[x + 2][y + 1] + " | " + tabuleiro[x + 2][y + 2]
                    + "  \n";

            if (tabuleiro[0][0] == player && tabuleiro[0][1] == player && tabuleiro[0][2] == player) { // LINHA 1
                System.out.println(jogada);
                System.out.println("O Jogador " + player + " ganhou a partida.\n");
                joga = false;
            } else if (tabuleiro[1][0] == player && tabuleiro[1][1] == player && tabuleiro[1][2] == player) { // LINHA 2
                System.out.println(jogada);
                System.out.println("O Jogador " + player + " ganhou a partida.\n");
                joga = false;
            } else if (tabuleiro[2][0] == player && tabuleiro[2][1] == player && tabuleiro[2][2] == player) { // LINHA 3
                System.out.println(jogada);
                System.out.println("O Jogador " + player + " ganhou a partida.\n");
                joga = false;

            } else if (tabuleiro[0][0] == player && tabuleiro[1][0] == player && tabuleiro[2][0] == player) { // COLUNA
                                                                                                              // 1
                System.out.println(jogada);
                System.out.println("O Jogador " + player + " ganhou a partida.\n");
                joga = false;
            } else if (tabuleiro[0][1] == player && tabuleiro[1][1] == player && tabuleiro[2][1] == player) { // COLUNA
                                                                                                              // 2
                System.out.println(jogada);
                System.out.println("O Jogador " + player + " ganhou a partida.\n");
                joga = false;
            } else if (tabuleiro[0][2] == player && tabuleiro[1][2] == player && tabuleiro[2][2] == player) { // COLUNA
                                                                                                              // 3
                System.out.println(jogada);
                System.out.println("O Jogador " + player + " ganhou a partida.\n");
                joga = false;

            } else if (tabuleiro[0][0] == player && tabuleiro[1][1] == player && tabuleiro[2][2] == player) { // DIAGONAL
                                                                                                              // \
                System.out.println(jogada);
                System.out.println("O Jogador " + player + " ganhou a partida.\n");
                joga = false;
            } else if (tabuleiro[2][0] == player && tabuleiro[1][1] == player && tabuleiro[0][2] == player) { // DIAGONAL
                                                                                                              // /
                System.out.println(jogada);
                System.out.println("O Jogador " + player + " ganhou a partida.\n");
                joga = false;

            } else if (partida >= 9) { // EMPATE
                System.out.println(jogada);
                System.out.println(" Não houve vencedor");
                joga = false;
            }
        }
        scan.close();
    }
}