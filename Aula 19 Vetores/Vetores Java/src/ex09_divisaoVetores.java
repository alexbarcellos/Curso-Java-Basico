import java.util.Scanner;

public class ex09_divisaoVetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] vetorA = new float[5];
        float[] vetorB = new float[vetorA.length];
        float[] vetorC = new float[vetorA.length];
        String msg1 = "\nVETOR A:  ";
        String msg2 = "VETOR B:  ";
        String msg3 = "VETOR C:  ";

        System.out.println("\n" + msg1);
        for (int i =0 ; i < vetorA.length ; i++) {
            System.out.print("Pos " + i + ":  ");
            vetorA[i] = scan.nextFloat();
            msg1 += vetorA[i] + "\t";
        }

        System.out.println("\n" + msg2);
        for (int i =0 ; i < vetorA.length ; i++) {
            System.out.print("Pos " + i + ":  ");
            vetorB[i] = scan.nextFloat();
            msg2 += vetorB[i] + "\t";
            vetorC[i] = vetorA[i] / vetorB[i];

            if (vetorB[i] == 0) { // tratamento da divisão por 0
                msg3 += "Dv/0\t";
            } else {
                msg3 += vetorC[i] + "\t";
            }
        }

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3 + "\n");

        scan.close();
    }
}