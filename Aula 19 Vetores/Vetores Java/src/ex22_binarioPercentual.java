public class ex22_binarioPercentual {
    public static void main(String[] args) {
        int binarios[] = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;
    
        for (int i = 0 ; i < binarios.length; i++) {
            binarios[i] = (int)Math.round(Math.random()*1);
            System.out.print((int)binarios[i] + "  ");

            if (binarios[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }
        double pctg0 = (qtd0*100)/binarios.length;
        double pctg1 = (qtd1*100)/binarios.length;
        System.out.println("\n" + pctg0 + "% são ZEROs");
        System.out.println("\n" + pctg1 + "% são UMs");
    }
}