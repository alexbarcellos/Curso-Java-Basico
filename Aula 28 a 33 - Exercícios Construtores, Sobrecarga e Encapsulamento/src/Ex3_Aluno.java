import java.util.Scanner;

public class Ex3_Aluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        aluno1.CadastrarAluno();
        System.out.print("Quantas matérias cursa: ");
        if (aluno1.CadastrarMaterias(scan.nextInt())) {
            aluno1.ExibirFicha();
            System.out.println("RESULTADO FINAL");
            aluno1.Resultado();
        } else {
            System.out.println("\nNão há matérias para exibir notas!!! \n");
        }
        scan.close();
    }
}
