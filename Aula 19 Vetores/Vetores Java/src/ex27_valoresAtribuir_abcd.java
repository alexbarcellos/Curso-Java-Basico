import java.util.Scanner;

public class ex27_valoresAtribuir_abcd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];
        String msgA = "\nVetor A:\t";
        String msgB = "Vetor A:\t";

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite a posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            if ( vetorA[i] < 7) {
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10  ) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else if (vetorA[i] > 10){
                vetorB[i] = 'e';                
            }
            msgA += vetorA[i] + "\t";
            msgB += vetorB[i] + "\t";
        }

        System.out.println(msgA);
        System.out.println(msgB);

        scan.close();
    }
}