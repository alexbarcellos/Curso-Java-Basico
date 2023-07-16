public class PessoaJuridica extends Contribuinte { 
    private String cnpj;

    PessoaJuridica(String nome, String cnpj, double rendaBruta) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return super.getRendaBruta() * 0.1 ; // 10%
    }

    @Override
    public String toString() {
        String info = "IMPOSTO DA PESSOA Juridica\n";
        info += "CNPJ: " + getCnpj();
        info += super.toString();
        info += String.format("\nImposto: %.2f\n", calcularImposto());
        return info;
    }
}
