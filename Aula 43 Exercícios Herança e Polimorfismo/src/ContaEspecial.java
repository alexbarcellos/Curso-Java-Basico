public class ContaEspecial extends ContaCorrente {
    private double limite;

    public ContaEspecial(double limite) {
        setLimite(limite);
        setSaldo(limite) ;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double saque) {
        if (super.getSaldo() - saque >= this.limite) {
            setSaldo(getSaldo() - saque);
            System.out.println("Saque - " + saque);
            return true;
        }
        return false;
    }

    public void depositar(double deposito) {
        setSaldo(getSaldo() + deposito);
        System.out.println("Deposito + " + deposito);
    }
    
    @Override
    public String toString() {
        return "ContaEspecial " + super.toString() +
        "Saldo sem limite=" + ( getSaldo() - getLimite() );
    }
}