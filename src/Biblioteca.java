import java.util.Scanner;

public class Biblioteca {

    Livro[] livro = new Livro[8000];
    Usuarios[] usuarios = new Usuarios[4000];

    Biblioteca() {
        // LAZER
        livro[Livro.getNumLivros()] = new Livro("Percy Jackson e O Ladrao de Raios", "Rick Riordan", "Intrinseca", 2005);
        livro[Livro.getNumLivros()] = new Livro("Percy Jackson e O Mar de Monstros", "Rick Riordan", "Intrinseca", 2006);
        livro[Livro.getNumLivros()] = new Livro("Percy Jackson e A Maldicao do Tita", "Rick Riordan", "Intrinseca", 2007);
        livro[Livro.getNumLivros()] = new Livro("Percy Jackson e A Batalha do Labririnto", "Rick Riordan", "Intrinseca", 2008);
        livro[Livro.getNumLivros()] = new Livro("Percy Jackson e O Ultimo Olimpiano", "Rick Riordan", "Intrinseca", 2009);
        livro[Livro.getNumLivros()] = new Livro("Se nao sou eu, quem vai fazer voce feliz", "Graziela Goncalves", "Paralela", 2018);
        livro[Livro.getNumLivros()] = new Livro("Beyonce Songbook", "Beyonce", "Hal Leonard", 2015);
        livro[Livro.getNumLivros()] = new Livro("Harry Potter: A serie completa", "J.K. Rowling", "ROCCO", 1998);
        livro[Livro.getNumLivros()] = new Livro("O Hobbit", "J.R.R. Tolkien", "HarperCollins", 1937);
        livro[Livro.getNumLivros()] = new Livro("As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "C.S. Lewis", "HarperCollins", 1950);
        livro[Livro.getNumLivros()] = new Livro("Indiana Jones e os Caçadores da Arca Perdida", "Campbell Black", "Ballantine Books", 1981);
        livro[Livro.getNumLivros()] = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", "Allen & Unwin", 1954);
        livro[Livro.getNumLivros()] = new Livro("Jogos Vorazes", "Suzanne Collins", "Scholastic Press", 2008);

        // ESTUDOS
        livro[Livro.getNumLivros()] = new Livro("A Ditadura Envergonhada", "Elio Gaspari", "Intrinseca", 2002);
        livro[Livro.getNumLivros()] = new Livro("A Ditadura Escancarada", "Elio Gaspari", "Intrinseca", 2002);
        livro[Livro.getNumLivros()] = new Livro("O Povo Brasileiro", "Darcy Ribeiro", "Global", 1995);
        livro[Livro.getNumLivros()] = new Livro("Raizes do Brasil", "Sergio Buarque", "Jose Olympio", 1936);
        livro[Livro.getNumLivros()] = new Livro("O Animal Social", "Elliot Aronson", "Goyo", 1972);
        livro[Livro.getNumLivros()] = new Livro("Álgebra Linear e Suas Aplicações", "Gilbert Strang", "Cengage Learning", 2006);
        livro[Livro.getNumLivros()] = new Livro("Geometria Analítica", "Hamilton Luiz Guidorizzi", "LTC", 2014);
        livro[Livro.getNumLivros()] = new Livro("Equações Diferenciais Ordinárias", "Boyce e DiPrima", "Wiley", 2017);
        livro[Livro.getNumLivros()] = new Livro("Introdução à Teoria dos Números", "Ivan Niven", "LTC", 2010);

        // EXTRA
        livro[Livro.getNumLivros()] = new Livro("Da total pra gente!", "Divas de Info", "POO", 2024);

        //Moradores
        usuarios[Usuarios.getNumUsuarios()] = new Morador("Joaozinho das Couves", "123.456.789-00");
        usuarios[Usuarios.getNumUsuarios()] = new Morador("Cleusa das Quitandas", "174.486.799-10");
        usuarios[Usuarios.getNumUsuarios()] = new Morador("Marta das Frutas", "321.765.779-09");

        //Alunos
        usuarios[Usuarios.getNumUsuarios()] = new Aluno("Heitor de Sousa", "143.226.939-87", "COLTEC");
        usuarios[Usuarios.getNumUsuarios()] = new Aluno("Ana Julia Ferreira", "273.398.287-65", "COLTEC");
        usuarios[Usuarios.getNumUsuarios()] = new Aluno("Isadora Ramos", "179.826.654-54", "COLTEC");
        usuarios[Usuarios.getNumUsuarios()] = new Aluno("Julia Souza", "917.612.525-52", "COLTEC");

        //Professores
        usuarios[Usuarios.getNumUsuarios()] = new Professor("Joao Montandon", "998.917.846.66", "Ciencia da Computacao");
        usuarios[Usuarios.getNumUsuarios()] = new Professor("Marcio Fantini", "916.512.534-63", "Fisica");
        usuarios[Usuarios.getNumUsuarios()] = new Professor("Humberto Honda", "327.928.172-62", "Engenharia Eletrica");
        usuarios[Usuarios.getNumUsuarios()] = new Professor("Virginia Mota", "521.825.251-55", "Ciencia da Computacao");
        usuarios[Usuarios.getNumUsuarios()] = new Professor("Leandro Maia", "392.261.353.22", "Ciencia da Computacao");

    }

    public void realizarDevolucao(int idUsuario, Livro livro) {
        if(usuarios[idUsuario].devolverLivro(livro)) {
            System.out.println("Devolução do livro '"+ livro.getTitulo() +"' para '"+ usuarios[idUsuario].getNome() +"' concluído.");
        } else {
            System.out.println("Erro ao devolver '" + livro.getTitulo() + "'.");
        }
    }

    public void realizarEmprestimo(int idUsuario, Livro livro) {
        if(usuarios[idUsuario].pegarLivro(livro)) {
            System.out.println("Empréstimo do livro '"+ livro.getTitulo() +"' para '"+ usuarios[idUsuario].getNome() +"' concluído.");
        } else {
            System.out.println("Erro ao alugar '" + livro.getTitulo() + "'.");
            System.out.println("Livro foi emprestado a outro usuario da biblioteca.");
        }
    }

    public void imprimirLivros() {
        System.out.println("<< IMPRIMINDO CATALOGO >>");
        for (int i = 0; i < Livro.getNumLivros(); i++) {
            livro[i].imprimir();
        }
    }

    public void cadastrarLivro () {
        Scanner input = new Scanner(System.in);
        String titulo, autor, editora;
        int anoPublicacao;

        System.out.println("<< CADASTRANDO LIVRO >>");
        System.out.print("Título: ");
        titulo = input.nextLine();

        System.out.print("Autor: ");
        autor = input.nextLine();

        System.out.print("Editora: ");
        editora = input.nextLine();

        System.out.print("Ano de Publicacao: ");
        anoPublicacao = input.nextInt();

        livro[Livro.getNumLivros()] = new Livro(titulo, autor, editora, anoPublicacao);

        System.out.println("<< LIVRO CASASTRADO COM SUCESSO! >>\n");
    }

    public void cadastrarUsuario () {
        Scanner input = new Scanner(System.in);
        String nome, cpf, formacao, escola;
        int opcao;
        String lixo;

        System.out.println("<< CADASTRANDO USUÁRIO >>");
        System.out.print("[1] Morador\n[2] Professor\n[3] Aluno\nOpção: ");
        opcao = input.nextInt();
        System.out.println();

        switch (opcao) {
            case 1:
                System.out.println("Nome: ");
                lixo = input.nextLine();
                nome = input.nextLine();

                System.out.println("CPF: ");
                cpf = input.nextLine();

                usuarios[Usuarios.getNumUsuarios()] = new Morador(nome, cpf);

                System.out.println("<< USUÁRIO CADASTRADO COM SUCESSO >>\n");
                break;
            case 2:
                System.out.println("Nome: ");
                nome = input.nextLine();

                System.out.println("CPF: ");
                cpf = input.nextLine();

                System.out.println("Formação: ");
                formacao = input.nextLine();

                usuarios[Usuarios.getNumUsuarios()] = new Professor(nome, cpf, formacao);

                System.out.println("<< USUÁRIO CADASTRADO COM SUCESSO >>\n");
                break;
            case 3:
                System.out.println("Nome: ");
                nome = input.nextLine();

                System.out.println("CPF: ");
                cpf = input.nextLine();

                System.out.println("Escola: ");
                escola = input.nextLine();

                usuarios[Usuarios.getNumUsuarios()] = new Aluno(nome, cpf, escola);

                System.out.println("<< USUÁRIO CADASTRADO COM SUCESSO >>\n");
                break;
            default:
                System.out.println("Resposta Inválida.");
                break;
        }
    }

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Inicializacao Usuarios
        Usuarios jc = biblioteca.usuarios[0];
        Usuarios cq = biblioteca.usuarios[1];
        Usuarios mf = biblioteca.usuarios[2];

        Usuarios big = biblioteca.usuarios[3];
        Usuarios naju = biblioteca.usuarios[4];
        Usuarios isa = biblioteca.usuarios[5];
        Usuarios julaia = biblioteca.usuarios[6];

        Usuarios joao = biblioteca.usuarios[7];
        Usuarios fanfan = biblioteca.usuarios[8];
        Usuarios honda = biblioteca.usuarios[9];
        Usuarios vivi = biblioteca.usuarios[10];
        Usuarios leoMaia = biblioteca.usuarios[11];

        // Inicializacao Livros
        Livro pj1 = biblioteca.livro[0];
        Livro pj2 = biblioteca.livro[1];
        Livro pj3 = biblioteca.livro[2];
        Livro pj4 = biblioteca.livro[3];
        Livro pj5 = biblioteca.livro[4];
        Livro cbjr = biblioteca.livro[5];
        Livro byc = biblioteca.livro[6];
        Livro hp = biblioteca.livro[7];
        Livro hobbit = biblioteca.livro[8];
        Livro narnia = biblioteca.livro[9];
        Livro jones = biblioteca.livro[10];
        Livro sda = biblioteca.livro[11];
        Livro jgsVorazes = biblioteca.livro[12];

        Livro ditadura1 = biblioteca.livro[13];
        Livro ditadura2 = biblioteca.livro[14];
        Livro pb = biblioteca.livro[15];
        Livro rBrasil = biblioteca.livro[16];
        Livro aSocial = biblioteca.livro[17];
        Livro mat1 = biblioteca.livro[18];
        Livro mat2 = biblioteca.livro[19];
        Livro mat3 = biblioteca.livro[20];
        Livro mat4 = biblioteca.livro[21];

        Livro surpresa = biblioteca.livro[22];

        System.out.println("<<BIBLIOTECA JAHI>>\n");

        biblioteca.imprimirLivros();

        biblioteca.cadastrarLivro();
        biblioteca.cadastrarUsuario();

        biblioteca.imprimirLivros();

        // Emprestimos
        biblioteca.realizarEmprestimo(jc.getId(), pj1);
        biblioteca.realizarEmprestimo(jc.getId(), pj2);

        biblioteca.realizarEmprestimo(big.getId(), byc);
        biblioteca.realizarEmprestimo(naju.getId(), pj5);
        biblioteca.realizarEmprestimo(isa.getId(), cbjr);
        biblioteca.realizarEmprestimo(julaia.getId(), hp);

        biblioteca.realizarEmprestimo(fanfan.getId(), mat4);
        biblioteca.realizarEmprestimo(joao.getId(), surpresa);

        System.out.print("\n");

        // Devolucoes
        biblioteca.realizarDevolucao(jc.getId(), pj1);
        biblioteca.realizarDevolucao(fanfan.getId(), mat4);

        System.out.print("\n");

        // Imprimir os livros alugados pelos usuarios
        jc.imprimirLivros();

        big.imprimirLivros();
        naju.imprimirLivros();
        isa.imprimirLivros();
        julaia.imprimirLivros();

        fanfan.imprimirLivros();
        joao.imprimirLivros();
    }
}
