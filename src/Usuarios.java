import java.util.Date;

public class Usuarios {

    private String nome;
    private String cpf;
    private Date dataNasc;
    public static int id = 0;
    protected Livro[] livrosAlugados;

    Usuarios (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        dataNasc = new Date();
        id++;
    }

    boolean devolverLivro(Livro livro, Usuarios usuario){

        for(int i = 0; i < livrosAlugados.length; i++){
            if(livrosAlugados[i].getId() == livro.getId()) {
                livrosAlugados[i]=null;
                System.out.println("Devolução do livro '"+ livro.getTitulo() +"' para '"+ usuario.getNome() +"' concluído.");
                return true;
            }
        }
        System.out.println("Erro ao devolver '" + livro.getTitulo() + "'.");
        return false;
    }

    boolean pegarLivro (Livro livro, Usuarios usuario){

        for(int i = 0; i < livrosAlugados.length; i++){
            if(livrosAlugados[i] == null) {
                livrosAlugados[i] = livro;
                System.out.println("Empréstimo do livro '"+ livro.getTitulo() +"' para '"+ usuario.getNome() +"' concluído.");
                return true;
            }
        }
        System.out.println("Erro ao alugar '" + livro.getTitulo() + "'.");
        System.out.println("Livro está emprestado com outro usuario da biblioteca.");
        return false;
    }

    void imprimirLivros(){
        System.out.println("Livros alugados pelo usuário '" + this.nome + "':");
        for(int i=0; i<livrosAlugados.length; i++){
            if (livrosAlugados[i] != null) {
                livrosAlugados[i].imprimir();
            }
        }
    }

    // getters

    String getNome(){
        return this.nome;
    }

    String getCpf(){
        return  this.cpf;
    }

    Date getDataNasc(){
        return this.dataNasc;
    }

    int getId(){
        return this.id;
    }

    // setter

    void setNome( String nome){
        this.nome = nome;
    }

    void setCpf( String cpf){
        this.cpf = cpf;
    }

    void setDataNasc( Date dataNasc){
        this.dataNasc = dataNasc;
    }

    void setId( int id){
        this.id = id;
    }
}
