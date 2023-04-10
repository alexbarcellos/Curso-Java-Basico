import java.util.Scanner;

public class Ex08_SalarioHora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nSalario Hora: R$");
        double salarioHora = scan.nextDouble();
        System.out.print("Horas Trabalhadas nesse mês: ");
        int horasTrabalhadas = scan.nextInt();
        double salario = horasTrabalhadas * salarioHora;
        System.out.print("Seu salário esse mê é de: R$" + salario);
        scan.close();
    }
}
