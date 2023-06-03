import java.util.Scanner;

public class Aluno {
    Scanner scan = new Scanner(System.in);
    String nome;
    int matricula;
    String curso;
    String[] materias;
    double[] mediasMateria;
    double[][] notasMateria;

    void ExibirFicha() {
        System.out.println("\n\nMatrícula: " + matricula);
        System.out.println("Nome:      " + nome);
        System.out.println("Curso:     " + curso);

        System.out.println();
        System.out.println(materias[0] + "\t\t" + materias[1] + "\t\t" + materias[2]);

        for (double[] notaMateria : notasMateria) {
            for (double nota : notaMateria) {
                System.out.print(nota + "\t\t\t");
            }
            System.out.println();
        }
    }

    void CadastrarAluno() {
        System.out.println("\nCadastro De Notas Escolares");
        System.out.print("\nMatricula: ");
        matricula = scan.nextInt();
        System.out.print("Nome:      ");
        nome = scan.next();
        System.out.print("Curso:     ");
        curso = scan.next();

        System.out.println("\nCadastre as 3 matérias: ");
        materias = new String[3];
        materias[0] = scan.next();
        materias[1] = scan.next();
        materias[2] = scan.next();
        mediasMateria = new double[materias.length];
        notasMateria = new double[4][materias.length];

        for (int i = 0; i < notasMateria.length; i++) {
            for (int j = 0; j < notasMateria[j].length; j++) {
                System.out.print("Nota " + (i + 1) + " de " + materias[j] + ": ");
                notasMateria[i][j] = scan.nextDouble(); 
                mediasMateria[j] += notasMateria[i][j];
            }
        }
    }

    void Resultado() {
        String result;
        System.out.println("Resultado final: ");
        for (double media : mediasMateria) {
            if (media / 4 >= 7) {
                result = " APROVADO ";
            } else {
                result = " REPROVADO ";
            }
            System.out.print((media / 4) + result + "\t\t");
        }
    }
}