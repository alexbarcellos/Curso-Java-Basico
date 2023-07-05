import java.util.Scanner;

public class Aluno {
    Scanner scan = new Scanner(System.in);

    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }

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

    public double cadastraNotas() {
        double soma = 0;
        notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota do " + (i+1) + "º Bimestre: ");
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }
        setNotas(notas);
        return soma / notas.length;
        
    }

    public String exibeInfo() {
        double soma = 0;
        String info = "\nAluno: " + getNome();
        info += "\nMatricula: " + getMatricula();
        info += "\nNotas Bimestrais: ";
        for (double nota : notas) {
            soma += nota;
            info += nota + "\t";
        }
        info += "MEDIA: " + (soma / notas.length);
        return info;
    }
}
