import java.util.Scanner;

public class ex10_turnoEstudoCumprimento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nQual Turno de Trabalho: [N / D / V]  ");
        String turno = scan.nextLine();
  
        switch (turno) { 
            case "N" :
            case "n" : System.out.println("Boa noite !"); break;
            case "D" :
            case "d" : System.out.println("Bom dia !"); break;
            case "V" :
            case "v" : System.out.println("Boa tarde !"); break;
            default: System.out.println("Inválido !!!");
        }  
        scan.close();     
    }
}
