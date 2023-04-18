import java.util.Scanner;

public class ex19_Operacao2Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado = 0;
        String lado, sinal;
        int mensagem = 1;

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
                mensagem = 0;
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
        if ( mensagem == 0 ) {
            System.out.println("Operação inválida");
        } else {
            System.out.println(numero1 + " " + operacao + " " + numero2 + " = " + resultado);
            System.out.println("número " + lado + " e " + sinal);
        }
        scan.close();
    }
}
