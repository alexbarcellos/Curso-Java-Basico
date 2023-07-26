public class Piramide extends Figura3D {
    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoligonosBase;
    private Figura2D base;

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getArestaBase() {
        return arestaBase;
    }
    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    public Figura2D getBase() {
        return base;
    }
    public void setBase(Figura2D base) {
        this.base = base;
    }
    public int getNumPoligonosBase() {
        return numPoligonosBase;
    }
    public void setNumPoligonosBase(int numPoligonosBase) {
        this.numPoligonosBase = numPoligonosBase;
    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            return (base.calcularArea() / 3) * altura;
        }
        return -1;
    }
    @Override
    public double calcularArea() {
        if (base != null) {
            return base.calcularArea() + (numPoligonosBase * ((arestaBase * apotema) / 2));
        }
        return 1;
    }
    
}