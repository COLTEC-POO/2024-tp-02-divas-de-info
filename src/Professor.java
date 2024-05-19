public class Professor extends Usuarios{
    private String formacao;

    Professor(String nome, String cpf, String formacao){
        super(nome, cpf);
        this.formacao = formacao;
        this.livrosAlugados = new Livro[10];
    }
}
