package Ex1_ContasBancarias;
public class ContaCorrente {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double saque) {
        if (this.saldo - saque >= 0) {
            this.saldo -= saque;
            System.out.println("Saque - " + saque);
            return true;
        }
        return false;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("Deposito + " + deposito);
    }

    @Override
    public String toString() {
        return " nomeCliente=" + nomeCliente + ", numConta=" + numConta + "\n";
    }

}
