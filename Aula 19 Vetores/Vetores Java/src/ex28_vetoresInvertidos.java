import java.util.Scanner;

public class ex28_vetoresInvertidos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorAZ = new int[10];
        int[] vetorZA = new int[vetorAZ.length];

        System.out.println("\nVetores invertidos. \nDigite os valores a inverter:");
        for (int i = 0, j = vetorAZ.length-1 ; i < vetorAZ.length ; i++, j--) {
            vetorAZ[i] = scan.nextInt();
            vetorZA[j] = vetorAZ[i];
        }
        System.out.println(""); 

        for (int i = 0 ; i < vetorAZ.length; i++) {
            System.out.print(vetorAZ[i] + "  ");
        }
        
        System.out.println("");

        for (int i = 0 ; i < vetorAZ.length; i++) {
            System.out.print(vetorZA[i] + "  ");
        }
            
        scan.close();
    }
}