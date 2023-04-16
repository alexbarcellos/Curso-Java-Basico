import java.util.Scanner;

public class ex09_sequenciaDecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEntre com um número: ");
        int numero1 = scan.nextInt();
        System.out.print("Entre com outro número: ");
        int numero2 = scan.nextInt();
        System.out.print("Entre com mais outro número: ");
        int numero3 = scan.nextInt();
        int maior, menor, meio; 
        
        // O bloco abaixo verifica o maior dos 3 numeros
        if ( (numero1 >= numero2) && (numero1 > numero3) ) {
            maior = numero1;
        } else if ( (numero2 >= numero1) && (numero2 > numero3)) {
            maior = numero2;
        } else { maior = numero3; }

        // O bloco abaixo verifica o menor dos 3 numeros
        if ( (numero1 <= numero2) && (numero1 < numero3) ) {
            menor = numero1;
        } else if ( (numero2 <= numero1) && (numero2 < numero3)) {
                menor = numero2;
        } else { menor = numero3; }

        // O bloco abaixo verifica o meio dos 3 numeros
        if ( (numero1 == maior) && (numero2 == menor) || (numero2 == maior) && (numero1 == menor)) {
            meio = numero3;
        } else if ( (numero1 == maior) && (numero3 == menor) || (numero3 == maior) && (numero1 == menor)) {
            meio = numero2;
        } else { meio = numero1; }

        System.out.println("Sequencia Decrescente: " + maior + " " + meio + " " + menor );
        scan.close();
    }
}