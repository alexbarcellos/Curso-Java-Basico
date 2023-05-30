public class Ex3_LivroLivraria {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();
        livro.autor = "Loiane Groner";
        livro.titulo = "Curso Java Básico";
        livro.paginas = 205;
        livro.preco = 67.50;
        livro.estoque = 7;

        System.out.printf("\nO Livro %s da autora %s, está custando %.2f mas só tem %d no estoque.\n\n", livro.titulo, livro.autor, livro.preco, livro.estoque);
    }
}