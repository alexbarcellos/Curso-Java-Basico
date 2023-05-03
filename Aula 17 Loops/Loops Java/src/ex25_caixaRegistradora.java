import java.util.Scanner;

public class ex25_caixaRegistradora {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean novaCompra = true;
        double totalGeral = 0;

        while (novaCompra) {
            boolean temProduto = true;
            double preço = 0;
            double subTotal = 0;
            int i = 0;
            System.out.println("\nLOJAS TABAJARA");

            while (temProduto) {
                System.out.print("Produto " + ++i + ": " );
                preço = scan.nextDouble();

                if (preço == 0) {
                    break;
                } else {
                    subTotal += preço;
                }
            }
            System.out.println("Sub Total: R$ " + subTotal);

            System.out.print("Dinheiro : R$ " );
            double dinheiro = scan.nextDouble();

            System.out.println("Troco    : R$ " + (dinheiro - subTotal));
            totalGeral += subTotal;

            System.out.print("\nPROXIMA COMPRA? [S/N] ");
            String continua = scan.next();

            if ( continua.equalsIgnoreCase("s")) {
                novaCompra = true;
            } else {
                novaCompra = false;
            }
        }    
        System.out.println("Total Geral do Dia: R$ " + totalGeral);
        scan.close();
    }
}