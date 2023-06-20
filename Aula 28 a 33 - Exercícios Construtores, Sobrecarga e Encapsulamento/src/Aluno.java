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

    public Aluno() { // inicializa os arrays
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

    public void CadastrarAluno() {

        System.out.println("\nCadastro De Notas Escolares");
        System.out.print("\nMatricula: ");
        setMatricula(scan.nextInt());
        System.out.print("Nome:      ");
        setNome(scan.next());
        System.out.print("Curso:     ");
        setCurso(scan.next());
    }

    public boolean CadastrarMaterias(int qtMaterias) { // recebe o nº de matérias
        if (qtMaterias < 1) {
            return false;
        } else {
            System.out.printf("\nCadastre as %s matérias: \n", qtMaterias + "");
            setMaterias(new String[qtMaterias]); // setando array para o nº de matérias

            for (int i = 0; i < getMaterias().length; i++) {
                System.out.printf("Matéria %s: ", (i + 1));
                getMaterias()[i] = scan.next();
            }

            CadastrarNotas();
            return true;
        }

    }

    private void CadastrarNotas() {
        mediasMateria = new double[getMaterias().length];
        notasMateria = new double[getMaterias().length][4]; // fixa notas em 4. Matérias variam

        for (int i = 0; i < getNotasMateria().length; i++) {

            for (int j = 0; j < getNotasMateria()[i].length; j++) {
                System.out.print("Nota " + (j + 1) + " de " + getMaterias()[i] + ": ");
                SetNotaPosIJ(scan.nextDouble(), i, j); // input da 'nota' na posição [i][j] do array 'notasMateria'
                this.mediasMateria[i] += notasMateria[i][j];
            }
        }
    }

    private void SetNotaPosIJ(double nota, int i, int j) { // recebe as notas no array de notas das matérias
        this.notasMateria[i][j] = nota;
    }

    public void ExibirFicha() {
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

    public void Resultado() {
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
