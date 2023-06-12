public class Ex2_ContaCorrente {
    public static void main(String[] args) {
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