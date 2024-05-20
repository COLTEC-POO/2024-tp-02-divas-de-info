public class Aluno extends Usuarios{
    private String escola;

    Aluno(String nome, String cpf, String escola){
        super(nome, cpf);
        this.escola = escola;
        this.livrosAlugados = new Livro[5];
    }
}
