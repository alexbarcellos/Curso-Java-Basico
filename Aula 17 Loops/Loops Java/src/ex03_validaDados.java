import java.util.Scanner;

public class ex03_validaDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String nome = null;        // > 3 caracteres
        String sexo = null;        // m f
        String estadoCivil = null; // c s v d
        double salario = 0;         // > 0
        int idade = 0;              // 0 a 15
        boolean flag = true;

        while (flag) {
            System.out.print("\nNome: ");
            nome = scan.next();

            if ( nome.length() < 3) {  
                System.out.println("\nNome muito curto... ");
            } else {
               
                flag = false;
            }
        }
        flag = true;
        while (flag) {
            System.out.print("Gênero: ");
            sexo = scan.next();
            if ( sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ) {  
                
                flag = false;
            } else {
                System.out.println("Gênero inválido (utilize 'F/M')... ");
            }
        }
        flag = true;
        while (flag) {
            System.out.print("Estado Civil: ");
            estadoCivil = scan.next();
            switch (estadoCivil) {
                case "s": 
                case "S":
                case "c": 
                case "C":
                case "v": 
                case "V":
                case "d": 
                case "D": 
                        
                        flag = false;
                            break;
                default: 
                        System.out.println("Estado Civil inválido. Utilize: ( S / C / V / D ) ...");
            }
        }
        flag = true;
        while (flag) {
            System.out.print("Idade: ");
            idade = scan.nextInt();
            if (idade >=0 && idade <= 15) {
                
                flag = false;
            } else {
                System.out.println("Idade deve estar entre 0 e 15 anos");
            }
        }
        flag = true;
        while (flag) {
            System.out.print("Salario: ");
            salario = scan.nextDouble();

            if (salario <= 0) {
                System.out.println("Salário deve ser maior que 0 ...");
            } else {
                
                flag = false;
            }
        }

        System.out.println("\n\nCadastro de Usuários efetuado com sucesso! ");
        System.out.println("\nNome: " + nome);
        System.out.println("Gênero: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil); 
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        scan.close();
    }
}