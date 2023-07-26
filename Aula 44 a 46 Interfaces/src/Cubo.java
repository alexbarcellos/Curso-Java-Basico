public class Cubo extends Figura3D {
    private double aresta;

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(aresta, 2);    
    }
    
}