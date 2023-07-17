public class Ex3_Zoologico {
    public static void main(String[] args) {
        System.out.println("***** ZOOLOGICO *****");

        Animal camelo = new Animal();
        camelo.setAmbiente("Terra");
        camelo.setPatas(4);
        camelo.setComprimento(1.5);
        camelo.setCor("Amarelo");
        camelo.setNome("Camelo");
        camelo.setVelocidade(2.0);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarao");
        tubarao.setComprimento(0.3);
        tubarao.setVelocidade(1.5);
        
        Mamifero urso = new Mamifero();
        urso.setNome("Urso do Canada");
        urso.setComprimento(1.8);
        urso.setAlimento("Mel");
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        for (Animal animal : animais) {
            System.out.println("-----------------------------------");
            System.out.println(animal);   // ou: System.out.println(animal.toString());
        }
    }
}
