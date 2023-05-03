import java.util.Scanner;

public class ex21_alunosPorSala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alunos;
        int escola = 0;
        System.out.print("\nQuantas turmas: ");
        int turmas = scan.nextInt();
        for ( int i = 1 ; i <= turmas ; i++ ) {
            System.out.print("Quantos alunos na " + i + "ª turma: ");
            alunos = scan.nextInt();
            if (alunos > 40) {
                System.out.println("Não ultrapassar 40 alunos por turma, redigite novamente:");
                i--;
            } else {
                escola += alunos;
            }
        }
        System.out.println("\nTotal de alunos na Escola: " + escola);
        System.out.println("Média de alunos por turma: " + escola / turmas);
        scan.close();
    }
}
