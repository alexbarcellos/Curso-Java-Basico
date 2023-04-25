import java.util.Scanner;

public class ex03_validaDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 1;       // respostas inválidas
        String nome;        // > 3 caracteres
        String sexo;        // m f
        String estadoCivil; // c s v d
        double salario;     // > 0
        int idade;          // 0 a 15
        while (flag > 0) {
            flag = 0;
            System.out.print("\nNome: ");
            nome = scan.next();
            System.out.print("Sexo: ");
            sexo = scan.next();
            System.out.print("Estado Civil: ");
            estadoCivil = scan.next();
            System.out.print("Idade: ");
            idade = scan.nextInt();
            System.out.print("Salario: ");
            salario = scan.nextDouble();

            if ( nome.length() < 3) {  
                flag++;
                System.out.println("\nNome muito curto... ");
            } else {
                System.out.println("\nNome ok!");
            }

            if ( sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ) {  
                System.out.println("Sexo ok!");
            } else {
                System.out.println("Sexo inválido (utilize 'F/M')... ");
                flag++;
            }

            switch (estadoCivil) {
                case "s": 
                case "S":
                case "c": 
                case "C":
                case "v": 
                case "V":
                case "d": 
                case "D": 
                        System.out.println("Estado Civil Ok!"); 
                            break;
                default: 
                        System.out.println("Estado Civil inválido. Utilize: ( S / C / V / D ) ...");
                        flag++;
            }

            if (idade >=0 && idade <= 15) {
                System.out.println("Idade Ok!");
            } else {
                System.out.println("Idade deve estar entre 0 e 15 anos");
                flag++;
            }

            if (salario <= 0) {
                System.out.println("Salário deve ser maior que 0 ...");
                flag++;
            } else {
                System.out.println("Salário ok !");
            }
        }
        System.out.println("Cadastro de Usuários efetuado com sucesso! ");
        scan.close();
    }
}