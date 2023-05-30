public class Ex2_Livro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "Loiane Groner";
        livro.titulo = "Curso Java Básico";
        livro.paginas = 205;

        System.out.printf("\nO Livro '%s', de %s, contém %d páginas.\n\n", livro.titulo, livro.autor, livro.paginas);
    }
}
