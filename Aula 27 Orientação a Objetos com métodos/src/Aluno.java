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

        for (double[] notaMateria : this.notasMateria) {
            for (double nota : notaMateria) {
                System.out.print(nota + "\t\t\t");
            }
            System.out.println();
        }
    }

    void CadastrarAluno() {
        System.out.println("\nCadastro De Notas Escolares");
        System.out.print("\nMatricula: ");
        this.matricula = scan.nextInt();
        System.out.print("Nome:      ");
        this.nome = scan.next();
        System.out.print("Curso:     ");
        this.curso = scan.next();

        System.out.println("\nCadastre as 3 matérias: ");
        this.materias = new String[3];
        this.materias[0] = scan.next();
        this.materias[1] = scan.next();
        this.materias[2] = scan.next();
        this.mediasMateria = new double[this.materias.length];
        this.notasMateria = new double[4][this.materias.length];

        for (int i = 0; i < this.notasMateria.length; i++) {
            for (int j = 0; j < this.notasMateria[j].length; j++) {
                System.out.print("Nota " + (i + 1) + " de " + this.materias[j] + ": ");
                this.notasMateria[i][j] = scan.nextDouble(); 
                this.mediasMateria[j] += this.notasMateria[i][j];
            }

        }
    }

    void Resultado() {
        String result;
        System.out.println("Resultado final: ");
        for (double media : this.mediasMateria) {
            if (media / 4 >= 7) {
                result = " APROVADO ";
            } else {
                result = " REPROVADO ";
            }
            System.out.print((media / 4) + result + "\t\t");
        }
    }
}


/*
this.notasMateria = new double[4][this.materias.length];
// entrada automática para TESTES (*1):
this.notasMateria[0][0] = 1;
this.notasMateria[0][1] = 5;
this.notasMateria[0][2] = 9;
this.notasMateria[1][0] = 2;
this.notasMateria[1][1] = 6;
this.notasMateria[1][2] = 10;
this.notasMateria[2][0] = 3;
this.notasMateria[2][1] = 7;
this.notasMateria[2][2] = 11;
this.notasMateria[3][0] = 4;
this.notasMateria[3][1] = 8;
this.notasMateria[3][2] = 12;
                
System.out.println("\n" + materias[0] + "\t\t" + materias[1] + "\t\t" + materias[2]);
*/