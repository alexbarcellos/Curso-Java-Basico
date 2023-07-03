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
        for (int i = 0 ; i < 5 ; i++) { 

            scan.nextLine();
            
            System.out.print("Nome do Aluno: ");
            String nomeAluno = scan.nextLine();
            if (nomeAluno.equals("")) {
                i = 5;
                System.out.println("*** Cadastro encerrado ***");
                break;
            }
            System.out.print("Matricula do Aluno: ");
            String matAluno = scan.nextLine();

            System.out.println("Cadastre as 4 notas do Aluno " + nomeAluno);

            double[] notasBim = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota do " + (j+1) + "º Bimestre: ");
                notasBim[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notasBim);
            alunos[i] = aluno; /////////////////////////////////// ufa !!!
        }

        curso.setAlunos(alunos);

        System.out.println(curso.exibeInfo());
        System.out.println(professor.exibeInfo());
        for (int i = 0; i < 5; i++) {
            System.out.println(alunos[i].getNome());
            System.out.println(alunos[i].exibeInfo());
        }
        
        scan.close();
    }
}
