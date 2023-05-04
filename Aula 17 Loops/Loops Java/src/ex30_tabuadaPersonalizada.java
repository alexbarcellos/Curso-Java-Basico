import java.util.Scanner;

public class ex30_tabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeiro = 1;
        int ultimo = 0;
        
        System.out.print("\nTabuada do: ");
        int n = scan.nextInt();

        while (primeiro > ultimo) {
            System.out.print("multiplo inicial: ");
            primeiro = scan.nextInt();

            System.out.print("multiplo final: ");
            ultimo = scan.nextInt();
        }

        for ( int i = primeiro ; i <= ultimo ; i++ ) {
            int tab = n * i;
            System.out.println(n + " X " + i + " = " + tab);
        }
        scan.close();
    }
}