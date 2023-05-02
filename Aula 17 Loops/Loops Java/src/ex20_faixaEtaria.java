import java.util.Scanner;

public class ex20_faixaEtaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean entraidade = true;
        int idade = 0;
        int soma = 0;
        int count = 0;
        double media = 0;
        String faixaEtaria = null;

        while ( entraidade ){
            System.out.print("Digite a idade: [0 para encerrar] ");
            idade = scan.nextInt();
            if ( idade > 0 ) {
                soma += idade;
                count ++;
            } else {
                entraidade = false;
            }
            media = soma / count;
            if ( media < 18 ) {
                faixaEtaria = "Jovem";
            } else if ( media > 60 ){
                faixaEtaria = "Idosa";
            } else {
                faixaEtaria = "Adulta";
            }
        }
        System.out.println("\nA média de idades desse grupo é de: "+ media + " anos.");
        System.out.println("Esse grupo está na faixa etária " + faixaEtaria);
        scan.close();
    }
}