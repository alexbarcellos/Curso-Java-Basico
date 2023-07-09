public class ContaPoupanca extends ContaCorrente {
    private int diaRendimento;
    private double taxa;

    public ContaPoupanca(int diaRendimento, double taxa) {
        setDiaRendimento(diaRendimento);
        setTaxa(taxa);
        setSaldo(0);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double calcularNovoSaldo(double taxa) {
        this.taxa = taxa;
        double saldoAtual = getSaldo();
        setSaldo( saldoAtual + (saldoAtual * (taxa / 100)) );
        return  getSaldo();
    }

    @Override
    public String toString() {
        return "ContaPoupança [nomeCliente=" + getNomeCliente() + ", numConta=" + getNumConta() + ", saldo corrigido a " + this.taxa + "% a/m: " + calcularNovoSaldo(2) + "]";
    }

}
