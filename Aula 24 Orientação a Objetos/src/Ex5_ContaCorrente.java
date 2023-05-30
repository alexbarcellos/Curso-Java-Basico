public class Ex5_ContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.banco = "Bradesco";
        conta.agencia = 037;
        conta.numero = 999123;
        conta.correntista = "Alexsandro Barcellos";
        conta.saldo = 1.99;
        conta.especial = true;
        conta.limite = 1000;

        System.out.println("\nDADOS BANCÁRIOS:");
        System.out.println("Banco:           " + conta.banco);
        System.out.println("Agencia:         " + conta.agencia);
        System.out.println("Número da conta: " + conta.numero);
        System.out.println("Correntista:     " + conta.correntista); 
        System.out.println("Saldo Atual:     " + conta.saldo);
        System.out.println("Conta Especial:  " + conta.especial); 
        System.out.println("Limite Especial: " + conta.limite);
    }
}
