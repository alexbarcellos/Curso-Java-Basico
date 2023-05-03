public class ex23_tabelaPrecos1_99 {
    public static void main(String[] args) {
        System.out.println("\nTabela de Preços - Loja de 1,99");
        for ( int i=1 ; i <= 100 ; i++ ) {
            System.out.println(i + " - R$ " + (i*1.99));
        }
    }
}