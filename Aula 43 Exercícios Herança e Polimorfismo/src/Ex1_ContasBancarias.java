public class Ex1_ContasBancarias {
    public static void main(String[] args) {
        System.out.println("\n---------------CONTA CORRENTE---------------");
        ContaCorrente cc = new ContaCorrente("Alex", "21398", 55.55);
        System.out.println(cc.toString());
        System.out.println("Saldo inicial: " + cc.getSaldo());
        cc.depositar(45.45);
        cc.sacar(10.00);
        cc.toString();
        System.out.println(cc.toString());

        System.out.println("\n--------------- Conta Poupança -------------------");
        ContaCorrente cp = new ContaPoupanca(31, 2.0);
        System.out.println("Saldo inicial: " + cp.getSaldo());
        cp.depositar(4000);
        cp.depositar(6001);
        cp.sacar(1);
        System.out.println("saldo atualizado até o dia " + cp.getDiaRendimento() + ": ");
        System.out.println(cp.toString());

        System.out.println("\n--------------- Conta Especial -------------------");
        ContaCorrente ce = new ContaEspecial(1000);
        System.out.println("Saldo inicial: " + ce.getSaldo());
        ce.depositar(500);
        ce.sacar(100);
        System.out.println("Saldo: " + ce.getSaldo());
        System.out.println(ce.toString());
    }
}