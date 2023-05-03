import java.util.Scanner;

public class ex27_temperaturasMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean cadastraTemp = true;
        double soma = 0;
        int i = 0;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;

        do {
            System.out.print("Informe a temperatura atual: "); // 10
            double temp = scan.nextDouble();

            if (temp <= min) {
                min = temp;
            }
            if (temp >= max) {
                max = temp;
            }
            System.out.print("Nova Temperatura? [S/N] ");
            String continua = scan.next();
            soma += temp;
            i++;
            
                if (continua.equalsIgnoreCase("s")) {
                    cadastraTemp = true;
                } else {
                    cadastraTemp = false;
                }

        } while( cadastraTemp );

        System.out.println("Máxima: " + max);
        System.out.println("Média : " + (soma/i));
        System.out.println("Mínima: " + min);
        scan.close();
    }
}
