import java.util.Scanner;

public class Ex2_Curso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n *** Cadastro de Cursos ***");

        System.out.print("\nNome do Curso: ");
        String curso = scan.nextLine();

        System.out.print("Hora do Curso: ");
        String horario = scan.nextLine();

        System.out.print("Professor: ");
        String professor = scan.nextLine();

        System.out.println("Cadastre os Alunos matriculados no Curso " + curso);
        Aluno aluno = new Aluno();

        int[] notas = new int[4];

        while (aluno.getNome() == null) {
            System.out.print("Nome do Aluno: ");
            aluno.setNome(scan.nextLine());

            System.out.println("Cadastre as 4 notas do Aluno " + aluno.getNome());

            for (int i = 0; i < 4; i++) {
                
                System.out.print("Nota do primeiro Bimestre: ");
                
                notas[i] = scan.nextInt();
                aluno.setNotas(notas);
                
            }

            for (int nota : notas) {
                System.out.println("nota" + nota);
            }
        }
        scan.close();
    }
}
