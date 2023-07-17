package Ex2_ImpostoDeRenda;
public class PessoaFisica extends Contribuinte {
    private String cpf;

    PessoaFisica(String nome, String cpf, double rendaBruta) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double calcularImposto() {
        double renda = getRendaBruta();

        if (renda <= 1400 ) {             // até 1400,00
            return 0;
        } else if (renda <= 2100 ) {      // de 1400,01 até 2100,00
            return (renda * .10) - 100;
        } else if (renda <= 2800 ) {      // de 2100,01 até 2800,00
            return (renda * .15) - 270;
        } else if (renda <= 3600 ) {      // de 2800,01 até 3600,00
            return (renda * .25) - 500;
        } else {                          // de 3600,01 acima
            return (renda * .30) - 700;
        }
    }

    @Override
    public String toString() {
        String info = "IMPOSTO DA PESSOA FISICA\n";
        info += "CPF: " + getCpf();
        info += super.toString();
        info += String.format("\nImposto: %.2f\n", calcularImposto());
        return info;
    }

}
