import java.util.Scanner;

public class Aluno {
    Scanner scan = new Scanner(System.in);

    private String nome;
    private int matricula;
    private String curso;
    private int qtdMaterias;
    private String[] materias;
    private double[] mediasMateria;
    private double[][] notasMateria;

    // ***************** Construtores ******************* 

    public Aluno() {
    }
    
    //   public Aluno(int qtdMaterias) { // não funciona como construtor, só como método void
    public void Aluno(int qtdMaterias) { // inicializa os arrays
        setQtdMaterias(qtdMaterias);
        materias = new String[getQtdMaterias()];
        mediasMateria = new double[4]; 
        notasMateria = new double[getQtdMaterias()][4];
    }

    // ***************** Getters & Setters *******************

    public void setQtdMaterias(int qtdMaterias) {
        this.qtdMaterias = qtdMaterias;
    }

    public int getQtdMaterias() {
        return qtdMaterias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public double[] getMediasMateria() {
        return mediasMateria;
    }

    public void setMediasMateria(double[] mediasMateria) {
        this.mediasMateria = mediasMateria;
    }

    public double[][] getNotasMateria() {
        return notasMateria;
    }

    public void setNotasMateria(double[][] notasMateria) {
        this.notasMateria = notasMateria;
    }

    // ********************** Metodos ************************

    public void cadastrarAluno() {

        System.out.println("\nCadastro De Notas Escolares");
        System.out.print("\nMatricula: ");
        setMatricula(scan.nextInt());
        System.out.print("Nome:      ");
        setNome(scan.next());
        System.out.print("Curso:     ");
        setCurso(scan.next());
    }

    public boolean cadastrarMaterias(int qtMaterias) { // recebe o nº de matérias
        Aluno(qtMaterias); // instanciando o construtor para validar os arrays

        if (getQtdMaterias() < 1) {
            return false;
        } else {
            System.out.printf("\nCadastre as %s matérias: \n", getQtdMaterias() + "");
            
            for (int i = 0; i < getMaterias().length; i++) {
                System.out.printf("Matéria %s: ", (i + 1));
                getMaterias()[i] = scan.next();
            }

            cadastrarNotas();
            return true;
        }
    }

    private void cadastrarNotas() {
        
        for (int i = 0; i < getNotasMateria().length; i++) {

            for (int j = 0; j < getNotasMateria()[i].length; j++) {
                System.out.print("Nota " + (j + 1) + " de " + getMaterias()[i] + ": ");
                this.notasMateria[i][j] = scan.nextDouble();
                this.mediasMateria[i] += this.notasMateria[i][j];
            }
        }
    }

    public void exibirFicha() {
        System.out.println("\n\nMatrícula: " + getMatricula());
        System.out.println("Nome:      " + getNome());
        System.out.println("Curso:     " + getCurso());
        System.out.println();
        
        for (int i = 0 ; i < getNotasMateria().length ; i++) { // gera todas as notas de cada matéria
            System.out.print(getMaterias()[i] + "\t");
            for (int j = 0 ; j < getNotasMateria()[i].length ; j++) {
                System.out.print(getNotasMateria()[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void resultado() {
        String result;
        for (int i = 0 ; i < getMaterias().length ; i ++) {
            if (getMediasMateria()[i] / 4 >= 7) {
                result = "  (APROVADO) ";
            } else {
                result = "  (REPROVADO) ";
            }
            System.out.println(getMaterias()[i] + " - Média: " + (getMediasMateria()[i] / 4) + result + "\t\t");
            
        }
    }
}
