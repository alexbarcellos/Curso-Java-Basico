import java.util.Scanner;

public class Ex2_CursoEscola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n *** Cadastro de Cursos ***");
        Curso curso = new Curso();

        System.out.print("\nNome do Curso: ");
        curso.setNome(scan.nextLine());

        System.out.print("Hora do Curso: ");
        curso.setHorario(scan.nextLine());

        Professor professor = new Professor();
        System.out.print("Professor: ");
        professor.setNome(scan.nextLine());

        System.out.print("Departamento: ");
        professor.setDepartamento(scan.nextLine());

        System.out.print("email: ");
        professor.setEmail(scan.nextLine());

        curso.setProfessor(professor); // carrega os dados do professor

        System.out.println("Cadastre os Alunos matriculados no Curso " + curso.getNome());

        Aluno[] alunos = new Aluno[5]; // máximo 5 alunos
        double somaTurma = 0;
        for (int i = 0 ; i < alunos.length ; i++) { 
            
            System.out.print("Nome do Aluno: ");
            String nomeAluno = scan.nextLine();
            if (nomeAluno.equals("")) {
                i = alunos.length;
                System.out.println("*** Cadastro encerrado ***");
                break;
            }
            System.out.print("Matricula do Aluno: ");
            String matAluno = scan.nextLine();

            System.out.println("Cadastre as 4 notas do Aluno " + nomeAluno);
            Aluno aluno = new Aluno();
            somaTurma += aluno.cadastraNotas(); // cadastra as notas e retorna a media do aluno            
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            alunos[i] = aluno; /////////////////////////////////// ufa !!!
        }
        curso.setAlunos(alunos);

        System.out.println(curso.exibeInfo());
        System.out.println(professor.exibeInfo());
        System.out.println("Media Geral da Turma: " + (somaTurma / alunos.length));
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].exibeInfo());
        }
        scan.close();
    }
}
