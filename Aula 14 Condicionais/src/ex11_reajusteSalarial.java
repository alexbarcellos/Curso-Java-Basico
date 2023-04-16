import java.util.Scanner;

public class ex11_reajusteSalarial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDigite o Salario: ");
        double salario = scan.nextDouble();
        double salarioAtual, reajuste, percentual;

        if (salario <= 280) { 
            percentual = 20;
        } else if (salario < 700) { 
            percentual = 15;
        } else if (salario < 1500) { 
            percentual = 10;
        } else { 
            percentual = 5;
        }
        salarioAtual = salario * (1 + (percentual / 100));
        reajuste = salarioAtual - salario;
        System.out.println("Salario Sem Reajuste: " + salario);   
        System.out.println("Valor desse Reajuste: " + reajuste); 
        System.out.println("Percentual  Reajuste: " + percentual + "%");  
        System.out.println("Salario com Reajuste: " + salarioAtual);
        scan.close();
    }
}
