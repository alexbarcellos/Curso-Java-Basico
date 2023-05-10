import java.util.Scanner;

public class ex17_VetorFaixaEtaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetorIdades = new int[10];
        String msg = "\nGrupo de Idades: ";
        int count = 0;

        System.out.println("\nEntre com as idades das pessoas");
        for (int i = 0 ; i < vetorIdades.length; i++) {
            System.out.print("Pessoa " + (i+1) + ":  ");
            vetorIdades[i] = scan.nextInt();
            msg += vetorIdades[i] + "  ";
            if (vetorIdades[i] > 34) {
                count++;
            }
        }
        System.out.println(msg);
        System.out.println("Sendo " + count + " pessoas com 35 anos ou mais. \n");
        scan.close();
    }
}