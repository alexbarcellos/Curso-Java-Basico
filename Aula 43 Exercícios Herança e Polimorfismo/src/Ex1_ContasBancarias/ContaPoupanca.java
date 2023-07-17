package Ex1_ContasBancarias;
import java.util.Calendar;

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

    private boolean calcularNovoSaldo(double taxa) {
        this.taxa = taxa;
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            setSaldo(getSaldo() + ( getSaldo() * (taxa/100) ));
            return true;
        }
            return false;
    }

    @Override
    public String toString() {
        return "ContaPoupança " + super.toString() +
            ((calcularNovoSaldo(getTaxa())) ? "Saldo corrigido a " + this.taxa + "% a/m: " + getSaldo() : "Saldo sem atualização: " + getSaldo() ) + "]";
    }

}
