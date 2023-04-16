import java.util.Scanner;

public class ex13_numeroDiaSemana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDia da Semana: ");
        String dia = scan.nextLine();   
        String diaSemana = dia.toLowerCase();
        int numeroSemana;     
        
        switch (diaSemana) {
            case "domingo":
                numeroSemana = 1;
                break;
            case "segunda":
                numeroSemana = 2;
                break;    
            case "terca":
                numeroSemana = 3;
                break;
            case "quarta":
                numeroSemana = 4;
                break;
            case "quinta":
                numeroSemana = 5;
                break;
            case "sexta":
                numeroSemana = 6;
                break;
            case "sabado":
                numeroSemana = 7;
                break;
            default: numeroSemana = 0;
        }
        System.out.println("Numero do dia: " + numeroSemana);
        scan.close();
    }
}