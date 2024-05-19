public class Biblioteca {

    Livro[] livro = new Livro[8000];
    Usuarios[] usuarios = new Usuarios[4000];
    Morador[] morador = new Morador[1000];
    Aluno[] aluno = new Aluno[2000];
    Professor[] professor = new Professor[1000];
    int idAtual;

    public void realizarDevolucao(Usuarios usuarios, Livro livro) {
        usuarios.devolverLivro(livro, usuarios);
    }

    public void realizarEmprestimo(Usuarios usuarios, Livro livro) {
        usuarios.pegarLivro(livro, usuarios);
    }

    public void imprimirLivros() {
        idAtual = Livro.id;
        System.out.println("<< IMPRIMINDO CATALOGO >>\n");
        for (int i = 0; i < idAtual; i++) {
            livro[i].imprimir();
        }
    }

    public void cadastrarLivro () {
        System.out.println("<< CADASTRANDO LIVROS >>\n");

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

        System.out.println("<< LIVROS CASASTRADOS COM SUCESSO! >>\n");
    }

    public void cadastrarUsuario () {
        System.out.println("<< CADASTRANDO USUARIOS >>\n");

        //Moradores
        morador[Usuarios.id] = new Morador("Joaozinho das Couves", "123.456.789-00");
        morador[Usuarios.id] = new Morador("Cleusa das Quitandas", "174.486.799-10");
        morador[Usuarios.id] = new Morador("Marta das Frutas", "321.765.779-09");

        //Alunos
        aluno[Usuarios.id] = new Aluno("Heitor de Sousa", "143.226.939-87", "COLTEC");
        aluno[Usuarios.id] = new Aluno("Ana Julia Ferreira", "273.398.287-65", "COLTEC");
        aluno[Usuarios.id] = new Aluno("Isadora Ramos", "179.826.654-54", "COLTEC");
        aluno[Usuarios.id] = new Aluno("Julia Souza", "917.612.525-52", "COLTEC");

        //Professores
        professor[Usuarios.id] = new Professor("Joao Montandon", "998.917.846.66", "Ciencia da Computacao");
        professor[Usuarios.id] = new Professor("Marcio Fantini", "916.512.534-63", "Fisica");
        professor[Usuarios.id] = new Professor("Humberto Honda", "327.928.172-62", "Engenharia Eletrica");
        professor[Usuarios.id] = new Professor("Virginia Mota", "521.825.251-55", "Ciencia da Computacao");
        professor[Usuarios.id] = new Professor("Leandro Maia", "392.261.353.22", "Ciencia da Computacao");

        System.out.println("<< USUARIOS CADASTRADOS COM SUCESSO >>\n");
    }

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("<<BIBLIOTECA JAHI>>\n");

        biblioteca.cadastrarLivro();
        biblioteca.cadastrarUsuario();
        biblioteca.imprimirLivros();

        // Inicializacao Usuarios
        Morador jc = biblioteca.morador[0];
        Morador cq = biblioteca.morador[1];
        Morador mf = biblioteca.morador[2];

        Aluno big = biblioteca.aluno[3];
        Aluno naju = biblioteca.aluno[4];
        Aluno isa = biblioteca.aluno[5];
        Aluno julaia = biblioteca.aluno[6];

        Professor joao = biblioteca.professor[7];
        Professor fanfan = biblioteca.professor[8];
        Professor honda = biblioteca.professor[9];
        Professor vivi = biblioteca.professor[10];
        Professor leoMaia = biblioteca.professor[11];

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

        // Emprestimos
        biblioteca.realizarEmprestimo(jc, pj1);
        biblioteca.realizarEmprestimo(jc, pj2);

        biblioteca.realizarEmprestimo(big, byc);
        biblioteca.realizarEmprestimo(naju, pj5);
        biblioteca.realizarEmprestimo(isa, cbjr);
        biblioteca.realizarEmprestimo(julaia, hp);

        biblioteca.realizarEmprestimo(fanfan, mat4);
        biblioteca.realizarEmprestimo(joao, surpresa);

        System.out.print("\n");

        // Devolucoes
        biblioteca.realizarDevolucao(jc, pj1);
        biblioteca.realizarDevolucao(fanfan, mat4);

        System.out.print("\n");

        // Imprimir os livros alugados pelos usuarios
        jc.imprimirLivros();
        mf.imprimirLivros();
        cq.imprimirLivros();

        big.imprimirLivros();
        isa.imprimirLivros();
        naju.imprimirLivros();
        julaia.imprimirLivros();

        joao.imprimirLivros();
        fanfan.imprimirLivros();
        honda.imprimirLivros();
        vivi.imprimirLivros();
        leoMaia.imprimirLivros();
    }
}
