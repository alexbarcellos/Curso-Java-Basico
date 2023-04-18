import java.util.Scanner;

public class ex17_anoBissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nAno ");
        int ano = scan.nextInt();
        if (ano % 4 == 0) {
            System.out.println(ano + " É UM ANO BISSESTO\n");
        } else {
            System.out.println(ano + " não é um ano bissesto\n");
        }
        scan.close();
    }
}
