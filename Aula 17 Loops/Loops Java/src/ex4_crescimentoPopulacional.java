public class ex4_crescimentoPopulacional {
    public static void main (String[] args) {
        double popA = 80_000;
        double popB = 200_000;
        double taxaCresA = 3, taxaCresB = 1.5;
        int anos = 0;

        while (popA < popB) {   
            popA += (popA * taxaCresA/100); // forma abreviada +=
            popB = popB + (popB * taxaCresB/100); // forma completa 
            anos ++;
            System.out.print("População A: " + popA);
            System.out.println("   ===   População B: " + popB);
        }
        System.out.println("Anos para População B alcançar/passar A:  " + anos);
    }
}
