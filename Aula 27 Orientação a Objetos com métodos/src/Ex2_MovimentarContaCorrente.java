import java.util.Scanner;

public class Ex2_MovimentarContaCorrente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        conta.limite = 1000;
        conta.ativa = true;

        conta.exibirSaldo();
        conta.depositar(999.99);
        conta.exibirSaldo();
        conta.sacar(2000);
        conta.exibirSaldo();
        conta.sacar(200.50);
        conta.exibirSaldo();
    }
}
