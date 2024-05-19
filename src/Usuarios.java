import java.util.Date;

public class Usuarios {

    private String nome;
    private String cpf;
    private Date dataNasc;
    private static int numUsuarios = 0;
    private int id;
    protected Livro[] livrosAlugados;

    Usuarios (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        dataNasc = new Date();
        this.id = numUsuarios;
        numUsuarios++;
    }

    boolean devolverLivro(Livro livro){

        for(int i = 0; i < livrosAlugados.length; i++){
            if (livrosAlugados[i] != null) {
                if(livrosAlugados[i].getId() == livro.getId()) {
                    livrosAlugados[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    boolean pegarLivro (Livro livro){

        for(int i = 0; i < livrosAlugados.length; i++){
            if(livrosAlugados[i] == null) {
                livrosAlugados[i] = livro;
                return true;
            }
        }
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

    static int getNumUsuarios() {
        return numUsuarios;
    }
}
