import java.util.Scanner;

public class ex19_mediaAritmeticaAmpla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean entraNota = true;
        double nota = 0;
        double media = 0;
        double count = 0;

        while ( entraNota ){
            System.out.print("Digite a nota: ");
            nota = scan.nextDouble();
            if ( nota >= 0 ) {
                media += nota;
                count ++;
            } else {
                entraNota = false;
            }
        }
        System.out.println("\nMédia de " + count + " notas: "+ media/count);
        scan.close();
    }
}