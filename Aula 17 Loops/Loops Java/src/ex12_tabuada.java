import java.util.Scanner;

public class ex12_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nTabuada do: ");
        int n = scan.nextInt();
        for ( int i = 1 ; i < 11 ; i++ ) {
            int tab = n * i;
            System.out.println(n + " X " + i + " = " + tab);
        }
        scan.close();
    }
}
