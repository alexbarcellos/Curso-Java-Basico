public class ex36_vetorPotenciaBase2 {
    public static void main(String[] args) {
        double[] vetorDePotencias = new double[11];

        System.out.println("\nValores de 2 elevados a 'N' \n(para 'N' de 0 a " + (vetorDePotencias.length-1) + ") :");

        for (int i = 0; i < vetorDePotencias.length; i++) {
            vetorDePotencias[i] = Math.pow(2,i);
            System.out.println("2 ^ " + i + " = " + (int)vetorDePotencias[i]);
        }
    }
}