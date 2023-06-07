import java.util.Scanner;

public class Ex4_JogoDaVelha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogo  = new JogoDaVelha();
        int posicao;
        String player = "X";

        //jogo.ExibirTabuleiro();

        
    
        jogo.Jogar();


        scan.close();
    }
}