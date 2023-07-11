public class Ex1_ContasBancarias {
    public static void main(String[] args) {
        System.out.println("\n---------------CONTA CORRENTE---------------");
        ContaCorrente cc = new ContaCorrente("Alex", "21398", 55.55);
        System.out.println(cc.toString());
        System.out.println("Saldo inicial: " + cc.getSaldo());
        cc.depositar(45.45);
        cc.sacar(10.00);
        
        System.out.println("ContaCorrente " + cc.toString() + "Saldo: " + cc.getSaldo());

        System.out.println("\n--------------- Conta Poupança -------------------");
        ContaPoupanca cp = new ContaPoupanca(11, 2.0);
        cp.setNomeCliente("Barcellos");
        cp.setNumConta("99-999-9");
        System.out.println("Saldo inicial: " + cp.getSaldo());
        cp.depositar(4000);
        cp.depositar(6001);
        cp.sacar(1);
        System.out.println("saldo para o dia " + cp.getDiaRendimento() + ": ");
        System.out.println(cp.toString());

        System.out.println("\n--------------- Conta Especial -------------------");
        ContaEspecial ce = new ContaEspecial(1000);
        ce.setNomeCliente("Souza");
        ce.setNumConta("11111-1");
        System.out.println("Saldo inicial: " + ce.getSaldo());
        ce.depositar(500);
        if (ce.sacar(100000)) {
            System.out.println("Saldo: " + ce.getSaldo());
        } else {
            System.out.println("Não foi possível sacar ");
        }

        System.out.println(ce.toString());
        System.out.println("Saldo com limite: " + ce.getSaldo());
    }

}