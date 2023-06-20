public class Ex1_AtivarContatdor {
    public static void main(String[] args) {
        Contador c1 = new Contador(); // Mesmo instanciados, métodos 'static' passados pelo
        Contador c2 = new Contador(); // construtor, são modificados como um só na classe.
        Contador c3 = new Contador(); // Não produzem vaores diferentes pelas instancias.

        Contador.incrementar();
        Contador.obterValor();
        c1.incrementar(); // mesmo que Contador.Incrementar();
        Contador.obterValor();
        c1.obterValor(); // mesmo que Contador.obterValor();
        c2.obterValor(); // mesmo que Contador.obterValor();
        c2.incrementar(); // mesmo que Contador.Incrementar();
        c3.obterValor(); // mesmo que Contador.obterValor();
        Contador.obterValor();
        Contador.zerar();
        Contador.obterValor();
    }
}