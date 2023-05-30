import java.util.Date;

public class Ex4_LivroBiblioteca {
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca();
        livro.autor = "Loiane Groner";
        livro.titulo = "Curso Java Básico";
        livro.paginas = 205;
        livro.usuario = "Alexsandro Barcellos";
        livro.emprestado = true;
        livro.devolucao = new Date();

        System.out.printf("\nLivro: %s\nEmprestado a: %s\nData de devolução: %s\n\n", livro.titulo, livro.usuario, livro.devolucao);
    }
}
