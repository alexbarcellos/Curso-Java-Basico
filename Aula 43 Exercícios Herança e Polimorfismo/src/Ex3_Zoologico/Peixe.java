package Ex3_Zoologico;
public class Peixe extends Animal{
    private String caracteristicas;

    Peixe() {
        super();
        super.setPatas(0);
        super.setAmbiente("Mar");
        super.setCor("Cinzenta");
        this.setCaracteristicas("Barbatanas e Cauda");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCaracteristicas: " + caracteristicas;
    }
    
}
