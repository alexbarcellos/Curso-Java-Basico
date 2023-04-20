import java.util.Scanner;

public class ex22_promocaoAcougue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double file = 5.80;
        double alcatra = 6.80;
        double picanha = 7.80;
        double subTotal = 0;
        double precoCarne = 0;
        double total = 0 ;
        
        System.out.println("\nEntre com o tipo da carne");
        System.out.print("Filé / Alcatra / Picanha:    ");
        String tipo = scan.nextLine();

        System.out.print("Quantos Kilos: ");
        int kg = scan.nextInt();

        if (kg > 5) {
            file = 4.90;
            alcatra = 5.90;
            picanha = 6.90;
        } 
        switch (tipo) {
            case "F":
                precoCarne = file;
                break;
            case "A":
                precoCarne = alcatra;
                break;
            case "P":
                precoCarne = picanha;
                break;
            default:
                System.out.println("Erro no sistema");
        }
        subTotal = kg * precoCarne;
        System.out.println("Subtotal da conta:  " + subTotal);

        System.out.print("Pagamento com nosso cartão? ");

        if (scan.next().equalsIgnoreCase("s") ) { 
        // não foi preciso criar varivel para entrar a condição

            total = subTotal - (subTotal*.1);
            System.out.println("Desconto de 10% aplicado: " + (subTotal*.1) );
            System.out.println("Total da nota: " + total);
        } else {
            System.out.println("Total da nota: " + subTotal);
        }
        scan.close();
    }
}
