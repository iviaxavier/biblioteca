package biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    private List<livro> listaLivros;
    private List<Usuario> listaUsuarios;
    private List<emprestimo> listaEmprestimos;

    public Biblioteca() {
        this.listaLivros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
        this.listaEmprestimos = new ArrayList<>();
    }

    public void cadastrarLivro(livro livroParaCadastrar) {
        this.listaLivros.add(livroParaCadastrar);
        System.out.println("Livro cadastrado: " + livroParaCadastrar.getTitulo());
    }

    public void cadastrarUsuario(Usuario usuarioParaCadastrar) {
        this.listaUsuarios.add(usuarioParaCadastrar);
        System.out.println("Usuário cadastrado: " + usuarioParaCadastrar.getNome() + " - " + usuarioParaCadastrar.getTipoUsuario());
    }

    public void emprestarLivro(Usuario usuarioQueEmpresta, livro livroParaEmprestar) {
        if (livroParaEmprestar.estaDisponivel()) {
            usuarioQueEmpresta.realizarEmprestimo(livroParaEmprestar);
            Date dataEmprestimo = new Date();
            Date dataDevolucao = new Date(System.currentTimeMillis() + (7L * 24 * 60 * 60 * 1000)); 
            emprestimo novoEmprestimo = new emprestimo(livroParaEmprestar, usuarioQueEmpresta, dataEmprestimo, dataDevolucao);
            this.listaEmprestimos.add(novoEmprestimo);
            System.out.println("Empréstimo registrado com sucesso.");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolverLivro(Usuario usuarioQueDevolve, livro livroParaDevolver) {
        usuarioQueDevolve.realizarDevolucao(livroParaDevolver);
        System.out.println("Devolução registrada.");
    }

    public List<livro> getListaLivros() {
        return this.listaLivros;
    }

    public List<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }

    public List<emprestimo> getListaEmprestimos() {
        return this.listaEmprestimos;
    }
}
