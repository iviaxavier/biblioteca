package biblioteca;

public abstract class Usuario {
    protected String nome;
    protected int id;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void realizarEmprestimo(livro livroParaEmprestar) {
        if (livroParaEmprestar.estaDisponivel()) {
            livroParaEmprestar.emprestar();
            System.out.println(this.nome + " realizou o empréstimo do livro: " + livroParaEmprestar.getTitulo());
        } else {
            System.out.println("O livro '" + livroParaEmprestar.getTitulo() + "' não está disponível.");
        }
    }

    public void realizarDevolucao(livro livroParaDevolver) {
        livroParaDevolver.devolver();
        System.out.println(this.nome + " devolveu o livro: " + livroParaDevolver.getTitulo());
    }

    public abstract String getTipoUsuario();

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return this.id;
    }
}
