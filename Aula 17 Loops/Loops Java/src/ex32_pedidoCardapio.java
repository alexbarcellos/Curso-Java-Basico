import java.text.DecimalFormat;
import java.util.Scanner;

public class ex32_pedidoCardapio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("R$ ###,###.00");
        int codigo = 99;
        String produto = "";
        int qtd = 0;
        double preco = 0;
        double total = 0;
        boolean valido = true;
        String output = "\nRESTAURANTE DO ZEZAO - CARDAPIO DO DIA\n\nESPECIFICAÇÃO\t\tQTD\tPREÇO";

        while (valido) {
            System.out.print("Codigo do Produto: ");
            codigo = scan.nextInt();

            if (codigo == 999) { // encerra o pedido
                produto = "";
                valido = false;
                preco = 0;
            } else {
                System.out.print("Quantidade: ");
                qtd = scan.nextInt();

                switch (codigo) {
                    case(100):
                        produto = "Cachorro-quente ";
                        preco = 1.20;
                        break;
                    case(101):
                        produto = "Bauru simples ";
                        preco = 1.30;
                        break;
                    case(102):
                        produto = "Bauru com ovo ";
                        preco = 1.50;
                        break;
                    case(103):
                        produto = "Hamburger      ";
                        preco = 1.20;
                        break;
                    case(104):
                        produto = "Cheeseburger   ";
                        preco = 1.30;
                        break;
                    case(105):
                        produto = "Refrigerante   ";
                        preco = 1.00;
                        break;
                    default:
                        preco = 0;
                        produto = "";
                        System.out.println("COD inválido [100 a 105 ou 999 para encerrar]");
                }
            }   

            total += preco;
            if (preco > 0) {  // Registra o produto em mais uma linha de output
                output += "\n> " + produto + "\t" + qtd + "\t" + format.format(preco);
            }
        } 
        output += "\n> TOTAL DO PEDIDO \t..."; // produz a linha final do pedido
        System.out.println("\n" + output + "\t" + format.format(total) + "\n");
        scan.close();
    }
}