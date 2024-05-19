import java.util.Scanner;

public class Biblioteca {

    Livro[] livro = new Livro[8000];
    Usuarios[] usuarios = new Usuarios[4000];
    int idAtual;

    Biblioteca() {
        // LAZER
        livro[Livro.id] = new Livro("Percy Jackson e O Ladrao de Raios", "Rick Riordan", "Intrinseca", 2005);
        livro[Livro.id] = new Livro("Percy Jackson e O Mar de Monstros", "Rick Riordan", "Intrinseca", 2006);
        livro[Livro.id] = new Livro("Percy Jackson e A Maldicao do Tita", "Rick Riordan", "Intrinseca", 2007);
        livro[Livro.id] = new Livro("Percy Jackson e A Batalha do Labririnto", "Rick Riordan", "Intrinseca", 2008);
        livro[Livro.id] = new Livro("Percy Jackson e O Ultimo Olimpiano", "Rick Riordan", "Intrinseca", 2009);
        livro[Livro.id] = new Livro("Se nao sou eu, quem vai fazer voce feliz", "Graziela Goncalves", "Paralela", 2018);
        livro[Livro.id] = new Livro("Beyonce Songbook", "Beyonce", "Hal Leonard", 2015);
        livro[Livro.id] = new Livro("Harry Potter: A serie completa", "J.K. Rowling", "ROCCO", 1998);
        livro[Livro.id] = new Livro("O Hobbit", "J.R.R. Tolkien", "HarperCollins", 1937);
        livro[Livro.id] = new Livro("As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "C.S. Lewis", "HarperCollins", 1950);
        livro[Livro.id] = new Livro("Indiana Jones e os Caçadores da Arca Perdida", "Campbell Black", "Ballantine Books", 1981);
        livro[Livro.id] = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", "Allen & Unwin", 1954);
        livro[Livro.id] = new Livro("Jogos Vorazes", "Suzanne Collins", "Scholastic Press", 2008);

        // ESTUDOS
        livro[Livro.id] = new Livro("A Ditadura Envergonhada", "Elio Gaspari", "Intrinseca", 2002);
        livro[Livro.id] = new Livro("A Ditadura Escancarada", "Elio Gaspari", "Intrinseca", 2002);
        livro[Livro.id] = new Livro("O Povo Brasileiro", "Darcy Ribeiro", "Global", 1995);
        livro[Livro.id] = new Livro("Raizes do Brasil", "Sergio Buarque", "Jose Olympio", 1936);
        livro[Livro.id] = new Livro("O Animal Social", "Elliot Aronson", "Goyo", 1972);
        livro[Livro.id] = new Livro("Álgebra Linear e Suas Aplicações", "Gilbert Strang", "Cengage Learning", 2006);
        livro[Livro.id] = new Livro("Geometria Analítica", "Hamilton Luiz Guidorizzi", "LTC", 2014);
        livro[Livro.id] = new Livro("Equações Diferenciais Ordinárias", "Boyce e DiPrima", "Wiley", 2017);
        livro[Livro.id] = new Livro("Introdução à Teoria dos Números", "Ivan Niven", "LTC", 2010);

        // EXTRA
        livro[Livro.id] = new Livro("Da total pra gente!", "Divas de Info", "POO", 2024);

        //Moradores
        usuarios[Usuarios.id] = new Morador("Joaozinho das Couves", "123.456.789-00");
        usuarios[Usuarios.id] = new Morador("Cleusa das Quitandas", "174.486.799-10");
        usuarios[Usuarios.id] = new Morador("Marta das Frutas", "321.765.779-09");

        //Alunos
        usuarios[Usuarios.id] = new Aluno("Heitor de Sousa", "143.226.939-87", "COLTEC");
        usuarios[Usuarios.id] = new Aluno("Ana Julia Ferreira", "273.398.287-65", "COLTEC");
        usuarios[Usuarios.id] = new Aluno("Isadora Ramos", "179.826.654-54", "COLTEC");
        usuarios[Usuarios.id] = new Aluno("Julia Souza", "917.612.525-52", "COLTEC");

        //Professores
        usuarios[Usuarios.id] = new Professor("Joao Montandon", "998.917.846.66", "Ciencia da Computacao");
        usuarios[Usuarios.id] = new Professor("Marcio Fantini", "916.512.534-63", "Fisica");
        usuarios[Usuarios.id] = new Professor("Humberto Honda", "327.928.172-62", "Engenharia Eletrica");
        usuarios[Usuarios.id] = new Professor("Virginia Mota", "521.825.251-55", "Ciencia da Computacao");
        usuarios[Usuarios.id] = new Professor("Leandro Maia", "392.261.353.22", "Ciencia da Computacao");

    }

    public void realizarDevolucao(Usuarios usuario, Livro livro) {
        if(usuario.devolverLivro(livro)) {
            System.out.println("Devolução do livro '"+ livro.getTitulo() +"' para '"+ usuario.getNome() +"' concluído.");
        } else {
            System.out.println("Erro ao devolver '" + livro.getTitulo() + "'.");
        }
    }
    public void realizarEmprestimo(Usuarios usuario, Livro livro) {
        if(usuario.pegarLivro(livro)) {
            System.out.println("Empréstimo do livro '"+ livro.getTitulo() +"' para '"+ usuario.getNome() +"' concluído.");
        } else {
            System.out.println("Erro ao alugar '" + livro.getTitulo() + "'.");
            System.out.println("Livro foi emprestado a outro usuario da biblioteca.");
        }
    }

    public void imprimirLivros() {
        idAtual = Livro.id;
        System.out.println("<< IMPRIMINDO CATALOGO >>");
        for (int i = 0; i < idAtual; i++) {
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

        livro[Livro.id] = new Livro(titulo, autor, editora, anoPublicacao);

        System.out.println("<< LIVRO CASASTRADO COM SUCESSO! >>\n");
    }

    public int cadastrarUsuario () {
        Scanner input = new Scanner(System.in);
        String nome, cpf, formacao, escola;
        int opcao;

        System.out.println("<< CADASTRANDO USUÁRIO >>");
        System.out.print("[1] Morador\n[2] Professor\n[3] Aluno\nOpção: ");
        opcao = input.nextInt();
        System.out.println();

        switch (opcao) {
            case 1:
                System.out.println("Nome: ");
                nome = input.nextLine();

                System.out.println("CPF: ");
                cpf = input.nextLine();

                usuarios[Usuarios.id] = new Morador(nome, cpf);

                System.out.println("<< USUÁRIO CADASTRADO COM SUCESSO >>\n");
                break;
            case 2:
                System.out.println("Nome: ");
                nome = input.nextLine();

                System.out.println("CPF: ");
                cpf = input.nextLine();

                System.out.println("Formação: ");
                formacao = input.nextLine();

                usuarios[Usuarios.id] = new Professor(nome, cpf, formacao);

                System.out.println("<< USUÁRIO CADASTRADO COM SUCESSO >>\n");
                break;
            case 3:
                System.out.println("Nome: ");
                nome = input.nextLine();

                System.out.println("CPF: ");
                cpf = input.nextLine();

                System.out.println("Escola: ");
                escola = input.nextLine();

                usuarios[Usuarios.id] = new Aluno(nome, cpf, escola);

                System.out.println("<< USUÁRIO CADASTRADO COM SUCESSO >>\n");
                break;
            default:
                System.out.println("Resposta Inválida.");
                break;
        }
        return Usuarios.id;
    }

    public int pesquisaLivro(String buscado) {
        for(int i = 0; i < usuarios.length; i++) {
            if(livro[i] == null) continue;
            else if (livro[i].getTitulo().equals(buscado)) {
                return livro[i].getId();
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner input = new Scanner(System.in);
        String resposta;
        boolean cadastrado = false;
        int opcao;
        int idUsuario = -1;
        int buscado;

        do {
            System.out.println("\n<<BIBLIOTECA JAHI>>\nDigite o seu CPF para entrar no sistema:");
            System.out.print("CPF: ");
            resposta = input.nextLine();

            // Verifica se o usuario está cadastrado
            for (int i = 0; i < biblioteca.usuarios.length; i++) {
                if(biblioteca.usuarios[i] == null) continue;
                else if (biblioteca.usuarios[i].getCpf().equals(resposta)) {
                    System.out.println("Seja bem-vindo novamente.");
                    idUsuario = biblioteca.usuarios[i].getId();
                    cadastrado = true;
                    break;
                }
            }

            if (!cadastrado) {
                System.out.println("\nUsuário não encontrado. Deseja cadastrar? [s/n]");
                resposta = input.nextLine();
                System.out.println();

                switch (resposta) {
                    case "s":
                        idUsuario = biblioteca.cadastrarUsuario();
                        cadastrado = true;
                        break;
                    case "n":
                        break;
                    default:
                        System.out.println("Resposta inválida.");
                }
            }

        } while (!cadastrado);

        do {
            System.out.println("\nO que deseja fazer hoje?");
            System.out.println("[1] Imprimir livros\n[2] Realizar um empréstimo\n[3] Realizar uma devolução\n[4] Doar um livro\n[0] Sair\nOpção: ");
            opcao = input.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    biblioteca.imprimirLivros();
                    break;
                case 2:
                    System.out.println("Digite o título do livro que deseja alugar: ");
                    resposta = input.nextLine();

                    buscado = biblioteca.pesquisaLivro(resposta);

                    if(buscado == -1) {
                        System.out.println("Livro não encontrado.");
                    } else {
                        biblioteca.realizarEmprestimo(biblioteca.usuarios[idUsuario], biblioteca.livro[buscado]);
                    }
                    break;
                case 3:
                    biblioteca.usuarios[idUsuario].imprimirLivros();

                    System.out.println("Digite o título do livro que deseja devolver: ");
                    resposta = input.nextLine();

                    buscado = biblioteca.pesquisaLivro(resposta);

                    if(buscado == -1) {
                        System.out.println("Livro não encontrado.");
                    } else {
                        biblioteca.realizarDevolucao(biblioteca.usuarios[idUsuario], biblioteca.livro[buscado]);
                    }
                    break;
                case 4:
                    biblioteca.cadastrarLivro();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Resposta Inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}
