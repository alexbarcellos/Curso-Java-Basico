import java.util.Scanner;

public class ex33_sequenciaNumerica {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m");
    System.out.print("Entre o n-ésimo numero da sequencia: ");
    int nFinal = scan.nextInt();
    for ( int n=1,  m=1 ; n <= nFinal ; n++, m +=2 ) {
        System.out.print(n + "/" + m + "   ");
    }
    System.out.print("\n\n");
    scan.close();
    }
}