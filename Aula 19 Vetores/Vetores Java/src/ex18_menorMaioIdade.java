import java.util.Scanner;

public class ex18_menorMaioIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetorIdades = new int[10];
        int max = vetorIdades[0];  
        int maxIndex = 0;
        int minIndex = 0;
        int min = Integer.MAX_VALUE; 
        String msg = "\nGrupo das idades:  ";

        System.out.println("\nEntre com as idades do grupo: ");
        for (int i = 0 ; i < vetorIdades.length ; i++) {
            System.out.print("Pessoa " + (i+1) + ":  ");
            vetorIdades[i] = scan.nextInt();
            msg+= vetorIdades[i] + "  ";
        
            if (vetorIdades[i] < min) { 
                min = vetorIdades[i];
                minIndex = i;
            }
            if (vetorIdades[i] > max) { 
                max = vetorIdades[i];
                maxIndex = i;
            }
        }
        System.out.print(msg + "\n");
        System.out.println("A menor idade do grupo é " + min + " - posição " + minIndex);
        System.out.println("A maior idade do grupo é " + max + " - posição " + maxIndex);
        scan.close();
    }
}