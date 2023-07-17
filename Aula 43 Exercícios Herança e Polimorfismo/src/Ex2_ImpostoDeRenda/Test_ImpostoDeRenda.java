package Ex2_ImpostoDeRenda;
public class Test_ImpostoDeRenda {
    public static void main(String[] args) {
        
        PessoaJuridica pj = new PessoaJuridica("Barcellos ME", "31649933/0001-37", 5600);
        PessoaFisica  pf1 = new PessoaFisica("Alexsandro", "111633654-37", 1000.0);
        PessoaFisica  pf2 = new PessoaFisica("De", "123456789-38", 1500.0);
        PessoaFisica  pf3 = new PessoaFisica("Souza", "987654321-39", 3000.0);
        PessoaFisica  pf4 = new PessoaFisica("Barcellos", "654789321-42", 4000.0);
        PessoaFisica  pf5 = new PessoaFisica("ASB", "123789456-41", 2200.0);

        Contribuinte[] contribuinte = new Contribuinte[6];
            
        contribuinte[0] = pj;
        contribuinte[1] = pf1;
        contribuinte[2] = pf2;
        contribuinte[3] = pf3;
        contribuinte[4] = pf4;
        contribuinte[5] = pf5;

        System.out.println("LISTAGEM DO CONTRIBUINTES, PAGADORES DE IMPOSTOS:\n");
        for (Contribuinte contr : contribuinte) {
            System.out.println(contr.toString());
        }

    }
}