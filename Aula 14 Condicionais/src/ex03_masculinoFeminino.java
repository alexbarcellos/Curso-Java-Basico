import java.util.Scanner;

public class ex03_masculinoFeminino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nSexo? [M/F] ");
        String sexo = scan.nextLine();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println(sexo + " - Sexo Masculino");
        } else {
            if ((sexo.equalsIgnoreCase("F"))) {
                System.out.println(sexo + " - Sexo Feminino");
            } else {
                System.out.println(sexo + " - Sexo Inválido");
            }
        }
        scan.close();
    }
}
