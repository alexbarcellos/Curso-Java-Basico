import java.util.Scanner;

public class ex08_multiplicaVetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg1 = "\nVETOR A:  ";
        String msg2 = "VETOR B:  ";
        String msg3 = "VETOR C:  ";
        int[] vetA = new int[5];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length];

        System.out.println(msg1);
        for (int i = 0 ; i < vetA.length; i++) {
            System.out.print("posição " + i + ":  ");
            vetA[i] = scan.nextInt();
            msg1 += vetA[i] + "   ";
        }

        System.out.println("\n" + msg2);
        for (int i = 0 ; i < vetB.length; i++) {
            System.out.print("posição " + i + ":  ");
            vetB[i] = scan.nextInt();
            vetC[i] = vetA[i] * vetB[i];
            msg2 += vetB[i] + "   ";
            msg3 += vetC[i] + "   ";
        }
    
        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3 + "(A*B)\n");
        scan.close();
    }
}