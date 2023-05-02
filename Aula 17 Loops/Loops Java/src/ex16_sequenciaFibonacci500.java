public class ex16_sequenciaFibonacci500 {
    public static void main(String[] args){
        System.out.print("\nEsta é a Sequencia de Fibonacci até 500");
        int ant = 1;
        int prox = 2;
        int seq = ant+prox;
        System.out.print("\n1 2");

        do {
            seq = ant + prox;
            System.out.print(" " + seq);
            ant = prox;
            prox = seq;
        } while ( (ant + prox) <= 500 );
    }
}