public class Ex06_Contato {
    public static void main(String[] args) {

        Contato contato1 = new Contato();
        contato1.nome = "Vanessa";
        contato1.sobrenome = "Mariano";
        contato1.grupo = "Familia";

        contato1.celular = new String[2];
        contato1.celular[0] = "(22) 9 1234-9857";

        contato1.fixo = new String[2];
        contato1.fixo[0] = "(22) 8005-1254";
        contato1.fixo[1] = "(22) 8005-1200";
       

        Contato contato2 = new Contato();
        contato2.nome = "Alexsandro";
        contato2.sobrenome = "Barcellos";
        contato2.grupo = "Familia";

        contato2.celular = new String[2];
        contato2.celular[0] = "(24) 9 8888-7766";
        contato2.celular[1] = "(24) 9 8886-1132";
        
        contato2.fixo = new String[2];
        contato2.fixo[0] = "(24) 7766-5512";

        System.out.println("\nLista de Contatos:");
        System.out.println(contato1.nome + ": Fixo " + contato1.fixo[0]);
        System.out.println(contato1.nome + ": Fixo " + contato1.fixo[1]);
        System.out.println(contato2.nome + ": Celular " + contato2.celular[0]);
        System.out.println(contato2.nome + ": Celular " + contato2.celular[1]);
    }
}
