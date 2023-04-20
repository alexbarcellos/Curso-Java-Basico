import java.util.Scanner;

public class ex21_descontoCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double descontoAlcool, descontoGasolina;
        double percentual = 0;
        double precoLitro = 0;

        System.out.print("\nQual combustível ? ");
        String combustivel = scan.nextLine();
        
        System.out.print("Quantos litros ? ");
        int litros = scan.nextInt();

        if (litros > 20 ) {
            descontoAlcool = 5;
            descontoGasolina = 6;
        } else {
            descontoAlcool = 3;
            descontoGasolina = 4;
        }

        if (combustivel.equalsIgnoreCase("g") ) {
            percentual = descontoGasolina;
            combustivel = "Gasolina";
            precoLitro = 2.50;
        } else if (combustivel.equalsIgnoreCase("a") ) { 
            percentual = descontoAlcool;
            combustivel = "Alcool";
            precoLitro = 1.90;
        } else {
            System.out.println("Combustível Inválido");
        }
        Double conta = litros * ( precoLitro - ( precoLitro * percentual/100 ) );

        System.out.println("\nCOMBUSTÍVEL:  " + combustivel);
        System.out.println("PREÇO/LITRO:  " + precoLitro);
        System.out.println("LITROS:       " + litros + "L ");
        System.out.println("DESCONTO:     " + percentual + "%"); 
        System.out.println("TOTAL CONTA : " + conta +"\n");
        scan.close();
    }
}
