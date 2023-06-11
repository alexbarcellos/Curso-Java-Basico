public class Ex3_Aluno {
    public static void main(String[] args) {
     
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.CadastrarAluno();
        aluno2.CadastrarAluno();
        aluno3.CadastrarAluno();

        aluno1.ExibirFicha();
        aluno1.Resultado();

        aluno2.ExibirFicha();
        aluno2.Resultado();

        aluno3.ExibirFicha();
        aluno3.Resultado();
    }
}