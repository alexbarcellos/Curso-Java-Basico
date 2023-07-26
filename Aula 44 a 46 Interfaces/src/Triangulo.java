public class Triangulo extends Figura2D {
    private double base;
    private double altura;

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
}