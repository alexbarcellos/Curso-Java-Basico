import java.util.Scanner;

public class ex18_menorMaioIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetorIdades = new int[10];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        String msg = "\nGrupo das idades:  ";

        System.out.println("\nEntre com as idades do grupo: ");
        for (int i = 0 ; i < vetorIdades.length ; i++) {
            System.out.print("Pessoa " + (i+1) + ":  ");
            vetorIdades[i] = scan.nextInt();
            msg+= vetorIdades[i] + "  ";
            //        10         -1
            if (vetorIdades[i] < max) {
                max = vetorIdades[i];
            }
            if (vetorIdades[i] > min) {
                min = vetorIdades[i];
            }
        } 

        System.out.print(msg + "\n");
        System.out.println("A menor idade do grupo é " + max);
        System.out.println("A maior idade do grupo é " + min);
        scan.close();
    }
}