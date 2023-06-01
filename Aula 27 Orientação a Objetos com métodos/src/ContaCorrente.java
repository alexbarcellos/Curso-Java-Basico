public class ContaCorrente {
    String banco;
    String correntista;
    int agencia;
    int numero;
    boolean ativa;
    boolean especial;
    double limite;
    double saldo;

    void exibirSaldo() {
        System.out.printf("\nSaldo: \t\tR$ %.2f \tSaldo + Limite: \tR$ %.2f", saldo, (saldo+limite));
    }

    void depositar (double deposito) {
        System.out.printf("\nDepósito: \tR$ %.2f", deposito);
        saldo += deposito;
    }

    void sacar (double saque) {
        if ( saldo + limite > saque ) {
            System.out.printf("\nSaque: \t\tR$ %.2f", saque);
            saldo -= saque;
        } else {
            System.out.printf("\nSaque: \t\tR$ %.2f \tSaldo insuficiente", saque);
        }
        
    }

}
