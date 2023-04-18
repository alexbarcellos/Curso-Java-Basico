import java.util.Scanner;

public class ex19_Operacao2Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado = 0;
        String lado, sinal;
        boolean valida = true;

        System.out.print("\nEntre com   um  número inteiro: ");
        double numero1 = scan.nextInt();
        System.out.print("Entre com outro número inteiro: ");
        double numero2 = scan.nextInt();
        System.out.print("Qual operação deseja ( + - * / ): ");
        String operacao = scan.next();
        
        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                    break;
            case "-":
                resultado = numero1 - numero2;
                    break;
            case "*":
                resultado = numero1 * numero2;
                    break;
            case "/":
                resultado = numero1 / numero2;
                    break;
            default:
            valida = false;
        }
        
        if (resultado < 0) {
            sinal = "negativo";
        } else {
            sinal = "positivo";
        }
        if ( resultado % 2 == 0 ) {
            lado = "par";
        } else {
            lado = "impar";
        }
        if ( valida ) {
            System.out.println(numero1 + " " + operacao + " " + numero2 + " = " + resultado);
            System.out.println("número " + lado + " e " + sinal);
        } else {
            System.out.println("Operação inválida");
        }
        scan.close();
    }
}
