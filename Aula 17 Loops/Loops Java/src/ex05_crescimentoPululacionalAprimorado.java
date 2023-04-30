import java.util.Scanner;
public class ex05_crescimentoPululacionalAprimorado {
        public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            int anos = 0;

            System.out.println("\nEntre com a População A: ");
            double popA = scan.nextDouble();

            System.out.println("\nEntre com a População B: ");
            double popB = scan.nextDouble();

            System.out.println("\nEntre com a de crescimento antual A: ");
            double taxaCresA = scan.nextDouble();
            
            System.out.println("\nEntre com a de crescimento antual B: ");
            double taxaCresB = scan.nextDouble();

            System.out.println("\nPopulação Inicial:");
            System.out.println("População A: " + popA + "\tTaxa de Crescimento Anual de " + taxaCresA + "%");
            System.out.println("População B: " + popB + "\tTaxa de Crescimento Anual de " + taxaCresB + "%");

            while (popA < popB) {   
                popA += (popA * taxaCresA/100); // forma abreviada +=
                popB = popB + (popB * taxaCresB/100); // forma completa 
                anos ++; 
            }
            System.out.println("\nApós decorridos " + anos + " anos:");
            System.out.println("População A: " + popA);
            System.out.println("População B: " + popB + "\n");

            System.out.print("Fazer outra comparação? [S/N] ");
            String continuar = scan.next(); 
            if (continuar.equalsIgnoreCase("s")) {
                continua = true;
            } else {
                continua = false;
            }
        }
        scan.close();
    }
}
