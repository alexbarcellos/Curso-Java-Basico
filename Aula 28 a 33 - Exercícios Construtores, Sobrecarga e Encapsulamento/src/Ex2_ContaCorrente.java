public class Ex2_ContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Itaú ", "Alexsandro ", 555, 999200, true, true, 000);
        
        conta.setLimite(000);
        conta.setEspecial(false);
        conta.exibirDados();
        conta.exibirSaldo();
        conta.depositar(999.99);
        conta.exibirSaldo();
        conta.sacar(2000);
        conta.exibirSaldo();
        conta.sacar(200.50);
        conta.exibirSaldo();
    }
} 