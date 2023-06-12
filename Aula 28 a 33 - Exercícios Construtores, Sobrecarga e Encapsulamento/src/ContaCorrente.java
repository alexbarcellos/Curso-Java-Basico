public class ContaCorrente {
    private String banco;
    private String correntista;
    private int agencia;
    private int numero;
    private boolean ativa;
    private boolean especial;
    private double limite;
    private double saldo;

    // CONSTRUTORES ******************************************************

    public ContaCorrente(String banco, String correntista, int agencia, int numero, boolean ativa, boolean especial,
            double limite) {
        this.banco = banco;
        this.correntista = correntista;
        this.agencia = agencia;
        this.numero = numero;
        this.ativa = ativa;
        this.especial = especial;
        this.limite = limite;
    }

    // GETTERS & SETTERS ******************************************************

    public String getBanco() {
        return banco;
    }

    public ContaCorrente() {
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // METODOS ADICIONAIS ******************************************************

    public void exibirDados() {
        System.out.printf("\nDADOS BANCÁRIOS DA CONTA CORRENTE");
        System.out.println(getBanco());
        System.out.println(getAgencia());
        System.out.println(getNumero());
        System.out.println(getCorrentista());
        System.out.println((isEspecial() ? "Cheque Especial" : "Conta Comum"));
        System.out.println(isEspecial() ? getLimite() : "");
           
        

    }

    public void exibirSaldo() {
        System.out.printf("\nSaldo: \t\tR$ %.2f \tSaldo + Limite: \tR$ %.2f", getSaldo(), (getSaldo() + getLimite()));
    }

    public void depositar(double deposito) {
        System.out.printf("\nDepósito: \tR$ %.2f", deposito);
        setSaldo(this.saldo + deposito);
    }

    public void sacar(double saque) {
        if (this.saldo + this.limite > saque) {
            System.out.printf("\nSaque: \t\tR$ %.2f", saque);
            setSaldo(this.saldo - saque);
        } else {
            System.out.printf("\nSaque: \t\tR$ %.2f \tSaldo insuficiente", saque);
        }

    }
}
