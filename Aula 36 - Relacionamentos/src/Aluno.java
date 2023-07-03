import java.util.Scanner;

public class Aluno {
    Scanner scan = new Scanner(System.in);

    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }

    //public Aluno(String nome) {
    //    this.nome = nome;
    //}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void exibeNotas() {
        System.out.println("nota do aluno 1" + getNotas()[0]); /// testando ...
        for (double nota : this.notas) {
            System.out.println("nota" + nota);
        }
    }

    public String exibeInfo() {
        String info = "\nAluno: " + getNome();
        info += "\nMatricula: " + getMatricula();
        info += "\nNotas Bimestrais:";
        for (double nota : notas) {
            info += nota + "\t";
        }
        return info;
    }
}
