import java.util.Scanner;

public class ex22_descontoFrutas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double morango = 2.50;
        double maca    = 1.80;
        
        System.out.print("\nQuantas maçãs ? ");
        int qtdMacas = scan.nextInt();
        
        System.out.print("Quantos morangos ? ");
        int qtdMorangos = scan.nextInt();

        if (qtdMacas > 5 ) {
            maca = 1.50;
        }
        if  (qtdMorangos > 5 ) {
            morango = 2.20;
        }
        double conta = ( qtdMacas * maca ) + ( qtdMorangos * morango);
       if ( (conta > 25 )  || ( (qtdMacas + qtdMorangos) > 8 )) {
            conta = conta*.90; // (-10%)
            System.out.println("Desconto de 10%: " + conta*.10);
        }    
        System.out.println("\nTotal com desconto:  " + conta +"\n");
        
        scan.close();
    }
}