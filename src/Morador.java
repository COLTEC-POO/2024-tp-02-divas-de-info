public class Morador extends Usuarios{
    Morador(String nome, String cpf){
        super(nome, cpf);
        this.livrosAlugados = new Livro[2];
    }
}
