import java.util.Scanner;

public class ex30_tabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nTabuada do: ");
        int n = scan.nextInt();

        System.out.print("multiplo inicial: ");
        int primeiro = scan.nextInt();

        System.out.print("multiplo final: ");
        int ultimo = scan.nextInt();

        for ( int i = primeiro ; i <= ultimo ; i++ ) {
            int tab = n * i;
            System.out.println(n + " X " + i + " = " + tab);
        }
        scan.close();
    }

}
